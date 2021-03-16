package pers.tornado.datav.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.tornado.datav.entity.DatavTemplate;
import pers.tornado.datav.entity.DatavTemplateScreenStretchRef;
import pers.tornado.datav.entity.DatavTemplateVo;
import pers.tornado.datav.service.DatavTemplateService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/template")
public class DatavTemplateController {

    private final DatavTemplateService datavTemplateService;

    public static List<DatavTemplateScreenStretchRef> refs;

    public DatavTemplateController(DatavTemplateService datavTemplateService) {
        this.datavTemplateService = datavTemplateService;
        refs = datavTemplateService.getRef();
    }


    @RequestMapping("/getAllTemplate")
    public Object getAllDatavTemplate() {
        return datavTemplateService.getAllDatavTemplate();
    }

    @RequestMapping("/getTemplateList")
    public Object getDatavUserTemplate(@RequestParam(value = "userID") int userID) {
//        System.out.println(userID);
        if (refs == null) {
            refs = datavTemplateService.getRef();
        }
        List<DatavTemplateVo> resultTemplateList = new ArrayList<>();
        List<DatavTemplate> tempResult = datavTemplateService.getDatavUserTemplate(userID);
        // PO to VO
        for (DatavTemplate datavTemplate : tempResult) {
            DatavTemplateVo tempTemplateVo = new DatavTemplateVo();
            tempTemplateVo.setTemplateID(datavTemplate.getTemplateID());
            tempTemplateVo.setTemplatePicUrl(datavTemplate.getTemplatePicUrl());
            tempTemplateVo.setUserID(datavTemplate.getUserID());
            tempTemplateVo.setDisabled(datavTemplate.getDisabled());
            Map<String, Object> screenStretch = new HashMap<>();
            int tempScreenStretchFlag = datavTemplate.getScreenStretch();
            for (DatavTemplateScreenStretchRef ref : refs) {
                if (ref.getScreenStretch() == tempScreenStretchFlag) {
                    screenStretch.put(ref.getScreenStretchMethod(), true);
                } else {
                    screenStretch.put(ref.getScreenStretchMethod(), false);
                }
            }
            tempTemplateVo.setScreenStretch(screenStretch);
            Map<String, Object> backgroundStyle = new HashMap<>();
            backgroundStyle.put("backgroundColor", datavTemplate.getBackgroundColor());
            backgroundStyle.put("backgroundImage", datavTemplate.getBackgroundImage());
            tempTemplateVo.setBackgroundStyle(backgroundStyle);
            tempTemplateVo.setScreendef(datavTemplate.getScreendef());

            resultTemplateList.add(tempTemplateVo);
        }
        return resultTemplateList;
    }

    @RequestMapping("appendTemplate")
    public Object appendTemplate(@RequestBody DatavTemplate datavTemplate) {
        datavTemplateService.insertUserTemplate(datavTemplate);
//        System.out.println(datavTemplate.toString());
        datavTemplateService.insertUserTemplateScreenDef(datavTemplate.getTemplateID());
        return datavTemplateService.getDatavUserTemplate(datavTemplate.getUserID());
    }

    @RequestMapping("spliceTemplate")
    public Object spliceTemplate(@RequestBody DatavTemplate datavTemplate) {
        datavTemplateService.spliceTemplate(datavTemplate);
        return datavTemplateService.getDatavUserTemplate(datavTemplate.getUserID());
    }

    @RequestMapping("deleteAllDisabledTemplate")
    public Object deleteAllDisabledTemplate() {
        return datavTemplateService.deleteAllDisabledTemplate();
    }
}
