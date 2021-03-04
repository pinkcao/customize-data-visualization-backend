package pers.tornado.datav.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.tornado.datav.service.ComponentTabDataService;

@RestController
@RequestMapping("/api/componentCol")
public class ComponentTabDataController {

    @Autowired
    private ComponentTabDataService componentTabDataService;

    @RequestMapping("/getComponentTabData")
    public Object getComponentTabData(){
        return componentTabDataService.getComponentTabData();
    }

}
