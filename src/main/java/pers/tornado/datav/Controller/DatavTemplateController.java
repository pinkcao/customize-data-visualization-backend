package pers.tornado.datav.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pers.tornado.datav.entity.DatavTemplate;
import pers.tornado.datav.service.DatavTemplateService;

import java.util.List;

@RestController
@RequestMapping("/api/template")
public class DatavTemplateController {

    @Autowired
    private DatavTemplateService datavTemplateService;

    @RequestMapping("/getAllTemplate")
    public Object getAllDatavTemplate() {
        return datavTemplateService.getAllDatavTemplate();
    }

    @RequestMapping("/getTemplateList")
    public Object getDatavUserTemplate(@RequestParam(value = "userID") int userID) {
//        System.out.println(userID);
        List<DatavTemplate> tempResult = datavTemplateService.getDatavUserTemplate(userID);
//        return datavTemplateService.getDatavUserTemplate(userID);

        return tempResult;
    }
}
