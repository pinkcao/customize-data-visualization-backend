package pers.tornado.datav.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @Autowired
    private DatavTemplateService datavTemplateService;

    private List<DatavTemplateScreenStretchRef> refs;

//    {
//        refs = datavTemplateService.getRef();
//    }

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
        for (int i = 0; i < tempResult.size(); i++) {
            DatavTemplateVo tempTemplateVo = new DatavTemplateVo();
            tempTemplateVo.setTemplateID(tempResult.get(i).getTemplateID());
            tempTemplateVo.setTemplatePicUrl(tempResult.get(i).getTemplatePicUrl());
            tempTemplateVo.setUserID(tempResult.get(i).getUserID());
            tempTemplateVo.setDisabled(tempResult.get(i).getDisabled());
            Map<String, Object> screenStretch = new HashMap<String, Object>();
            int tempScreenStretchFlag = tempResult.get(i).getScreenStretch();
            for (int j = 0; j < refs.size(); j++) {
                if (refs.get(j).getScreenStretch() == tempScreenStretchFlag) {
                    screenStretch.put(refs.get(j).getScreenStretchMethod(), true);
                } else {
                    screenStretch.put(refs.get(j).getScreenStretchMethod(), false);
                }
            }
            tempTemplateVo.setScreenStretch(screenStretch);
            Map<String, Object> backgroundStyle = new HashMap<String, Object>();
            backgroundStyle.put("backgroundColor", tempResult.get(i).getBackgroundColor());
            backgroundStyle.put("backgroundImage", tempResult.get(i).getBackgroundImage());
            tempTemplateVo.setBackgroundStyle(backgroundStyle);
            tempTemplateVo.setScreendef(tempResult.get(i).getScreendef());

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
}
