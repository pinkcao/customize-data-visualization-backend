package pers.tornado.datav.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.tornado.datav.entity.DatavTemplateComponent;
import pers.tornado.datav.entity.DatavTemplateComponentDataSource;
import pers.tornado.datav.entity.DatavTemplateComponentDataSourceVo;
import pers.tornado.datav.service.DatavTemplateComponentService;
import pers.tornado.datav.service.DatavTemplateComponentStyleService;
import pers.tornado.datav.service.DatavTemplateComponentDataSourceService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/component")
public class DatavTemplateComponentController {

    @Autowired
    private DatavTemplateComponentStyleService datavTemplateComponentStyleService;

    @Autowired
    private DatavTemplateComponentDataSourceService datavTemplateComponentDataSourceService;

    @Autowired
    private DatavTemplateComponentService datavTemplateComponentService;


    /*
    * 用于数据初始化的接口
    *
    *
    * */
    @RequestMapping("/componentTrans")
    public Object componentTrans(@RequestBody Map<String, List<DatavTemplateComponent>> componentList) {
//        System.out.println(componentList.toString());
//        System.out.println(componentList.get("componentList").get(1).toString());
        List<DatavTemplateComponent> tempComponentList = componentList.get("componentList");
        for (DatavTemplateComponent datavTemplateComponent : tempComponentList) {
            datavTemplateComponentStyleService.insertOneStyle(datavTemplateComponent.getTemplateID(), datavTemplateComponent.getIndex());
            DatavTemplateComponentDataSource tempSource = datavTemplateComponent.getDataSource();
            DatavTemplateComponentDataSourceVo datavTemplateComponentDataSourceVo = new DatavTemplateComponentDataSourceVo(tempSource);
            datavTemplateComponentDataSourceVo.setTemplateID(datavTemplateComponent.getTemplateID());
            datavTemplateComponentDataSourceVo.setIndex(datavTemplateComponent.getIndex());
            datavTemplateComponentDataSourceService.insertOneDataSource(datavTemplateComponentDataSourceVo);
            datavTemplateComponentService.insertOneTemplateComponent(datavTemplateComponent);
        }
        return componentList.get("componentList").get(0);
    }

    @RequestMapping("/getComponent")
    public Object getComponent(@RequestParam(value = "templateID") int templateID) {
        Map<String, Object> result = new HashMap<>();
        result.put("message", "获取成功");
        result.put("resultSet", datavTemplateComponentService.selectComponentByID(templateID));


        return result;
    }

    @RequestMapping("/appendComponent")
    public Object appendComponent(@RequestBody DatavTemplateComponent datavTemplateComponent) {
        Map<String, Object> result = new HashMap<>();
        datavTemplateComponentService.insertOneTemplateComponent(datavTemplateComponent);
        datavTemplateComponentStyleService.insertOneStyle(datavTemplateComponent.getTemplateID(), datavTemplateComponent.getIndex());
        DatavTemplateComponentDataSourceVo datavTemplateComponentDataSourceVo = new DatavTemplateComponentDataSourceVo(datavTemplateComponent.getDataSource());
        datavTemplateComponentDataSourceVo.setTemplateID(datavTemplateComponent.getTemplateID());
        datavTemplateComponentDataSourceVo.setIndex(datavTemplateComponent.getIndex());
        datavTemplateComponentDataSourceService.insertOneDataSource(datavTemplateComponentDataSourceVo);
        result.put("message","添加成功");
        result.put("resultSet", datavTemplateComponentService.selectComponentByID(datavTemplateComponent.getTemplateID()));
        return result;
    }

}
