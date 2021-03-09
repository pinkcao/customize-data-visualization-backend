package pers.tornado.datav.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.tornado.datav.entity.DatavTemplateComponent;

import java.util.Map;

@RestController
@RequestMapping("/api/component")
public class DatavTemplateComponentController {

    @RequestMapping("componentTrans")
    public Object componentTrans(@RequestBody Map<String, Object> componentList) {
        System.out.println(componentList.toString());
        return componentList.get("componentList");
    }

}
