package pers.tornado.datav.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.tornado.datav.service.ComponentTabDataDetailService;

@RestController
@RequestMapping("/componentTabDataDetail")
public class ComponentTabDataDetailController {

    @Autowired
    private ComponentTabDataDetailService componentTabDataDetailService;

    @RequestMapping("/getAll")
    public Object getComponentTabDataDetailList(){
        return componentTabDataDetailService.getComponentTabDataDetailList();
    }

}
