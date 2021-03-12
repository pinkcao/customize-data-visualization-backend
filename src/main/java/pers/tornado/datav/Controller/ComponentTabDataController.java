package pers.tornado.datav.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.tornado.datav.service.ComponentTabDataService;

@RestController
@RequestMapping("/api/componentCol")
public class ComponentTabDataController {

    private final ComponentTabDataService componentTabDataService;

    public ComponentTabDataController(ComponentTabDataService componentTabDataService) {
        this.componentTabDataService = componentTabDataService;
    }

    @RequestMapping("/getComponentTabData")
    public Object getComponentTabData(){
        return componentTabDataService.getComponentTabData();
    }

}
