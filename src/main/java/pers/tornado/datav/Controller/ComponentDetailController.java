package pers.tornado.datav.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.tornado.datav.service.ComponentDetailService;

@RestController
@RequestMapping("/componentDetail")
public class ComponentDetailController {

    @Autowired
    private ComponentDetailService componentDetailService;

    @RequestMapping("/getAll")
    public Object getComponentDetailList(){
        return componentDetailService.getAllComponentDetail();
    }

}
