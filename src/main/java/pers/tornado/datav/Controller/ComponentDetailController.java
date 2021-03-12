package pers.tornado.datav.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.tornado.datav.service.ComponentDetailService;

@RestController
@RequestMapping("/componentDetail")
public class ComponentDetailController {

    private final ComponentDetailService componentDetailService;

    public ComponentDetailController(ComponentDetailService componentDetailService) {
        this.componentDetailService = componentDetailService;
    }

    @RequestMapping("/getAll")
    public Object getComponentDetailList(){
        return componentDetailService.getAllComponentDetail();
    }

}
