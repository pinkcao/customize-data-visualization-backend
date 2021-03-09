package pers.tornado.datav.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.tornado.datav.entity.DatavTemplateScreendef;
import pers.tornado.datav.entity.ScreendefVo;
import pers.tornado.datav.service.DatavTemplateScreenService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/screen")
public class DatavTemplateScreenController {

    @Autowired
    private DatavTemplateScreenService datavTemplateScreenService;

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

}
