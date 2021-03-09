package pers.tornado.datav.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.tornado.datav.entity.*;
import pers.tornado.datav.service.DatavTemplateScreenService;
import pers.tornado.datav.service.DatavTemplateService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/screen")
public class DatavTemplateScreenController {

    @Autowired
    private DatavTemplateScreenService datavTemplateScreenService;

    @Autowired
    private DatavTemplateService datavTemplateService;

    @RequestMapping("/getScreenDef")
    public List<DatavTemplateScreendef> getScreenDef(@RequestParam(value = "templateID") int templateID) {
        List<DatavTemplateScreendef> defs = datavTemplateScreenService.getTemplateScreendef(templateID);
        return datavTemplateScreenService.getTemplateScreendef(templateID);
    }

//    @RequestMapping("/updateScreenDef")
//    public Object updateScreenDef(@RequestBody List<DatavTemplateScreendef> screenDef){
//        System.out.println(screenDef);
//        for (int i = 0; i < screenDef.size(); i++) {
//            System.out.println(datavTemplateScreendefService.updateScreendefWithID(screenDef.get(i)));
//        }
//        return 0;
//    }
    @RequestMapping("/updateScreenDef")
    public Object updateScreenDef(@RequestBody ScreendefVo screenDef){
//        System.out.println(screenDef.size());
        System.out.println(screenDef);
        for (int i = 0; i < screenDef.getScreenDef().size(); i++) {
            System.out.println(datavTemplateScreenService.updateScreendefWithID(screenDef.getScreenDef().get(i)));
        }
        return 0;
    }

    @RequestMapping("/getScreenStretch")
    public Object getScreenStretch(@RequestParam(value = "templateID") int templateID) {
        Map<String, Object> result = new HashMap<String, Object>();
        int screenStretch = datavTemplateScreenService.getScreenStretchWithID(templateID);
        for (int i = 0; i < DatavTemplateController.refs.size(); i++) {
            if (DatavTemplateController.refs.get(i).getScreenStretch() == screenStretch) {
                result.put(DatavTemplateController.refs.get(i).getScreenStretchMethod(),true);
            } else {
                result.put(DatavTemplateController.refs.get(i).getScreenStretchMethod(),false);
            }
        }
        return result;
    }

    @RequestMapping("/updateScreenStretch")
    public Object updateScreenStretch(@RequestBody DatavTemplateScreenStretchVo datavTemplateScreenStretchVo) {
        Map<String, Object> result = new HashMap<>();
        result.put("screenStretch", datavTemplateScreenStretchVo.getScreenStretch());
        result.put("templateID", datavTemplateScreenStretchVo.getTemplateID());
        int screenStretchParam = 0;
        System.out.println(DatavTemplateController.refs);
        for (int i = 0; i < DatavTemplateController.refs.size(); i++) {
            if (DatavTemplateController.refs.get(i).getScreenStretchMethod().equals(datavTemplateScreenStretchVo.getScreenStretch())) {
                screenStretchParam = DatavTemplateController.refs.get(i).getScreenStretch();
            }
        }
        DatavTemplate datavTemplate = new DatavTemplate();
        datavTemplate.setTemplateID(datavTemplateScreenStretchVo.getTemplateID());
        datavTemplate.setScreenStretch(screenStretchParam);
        return datavTemplateScreenService.updateScreenStretchWithID(datavTemplate);
    }

    @RequestMapping("/getBackgroundStyle")
    public Object getBackgroundStyle(@RequestParam(value = "templateID") int templateID) {
        Map<String, Object> map = new HashMap<>();
        DatavTemplate datavTemplate = datavTemplateService.getOneTemplate(templateID);
        map.put("backgroundColor", datavTemplate.getBackgroundColor());
        map.put("backgroundImage", datavTemplate.getBackgroundImage());
        return map;
    }

    @RequestMapping("/updateBackgroundStyle")
    public Object updateBackgroundStyle(@RequestBody DatavTemplateBackgroundVo datavTemplateBackgroundVo){
//        System.out.println(datavTemplateBackgroundVo.toString());
        return datavTemplateScreenService.updateBackgroundWithID(datavTemplateBackgroundVo);
    }

}
