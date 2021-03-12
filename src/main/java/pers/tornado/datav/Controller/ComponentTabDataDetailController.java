package pers.tornado.datav.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.tornado.datav.service.ComponentTabDataDetailService;

@RestController
@RequestMapping("/componentTabDataDetail")
public class ComponentTabDataDetailController {

    private final ComponentTabDataDetailService componentTabDataDetailService;

    public ComponentTabDataDetailController(ComponentTabDataDetailService componentTabDataDetailService) {
        this.componentTabDataDetailService = componentTabDataDetailService;
    }

    @RequestMapping("/getAll")
    public Object getComponentTabDataDetailList(){
        return componentTabDataDetailService.getComponentTabDataDetailList();
    }

}
