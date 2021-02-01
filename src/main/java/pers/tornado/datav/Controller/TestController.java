package pers.tornado.datav.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.tornado.datav.entity.TestJson;
import pers.tornado.datav.entity.TestList;
import pers.tornado.datav.service.TestService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/testsql")
    public Object getComponentTabDataDetailList(@RequestParam("sql")String sql){
        return testService.superManagerSelect(sql);
    }

    @RequestMapping("/testjson")
    public Object testConvertJson(@RequestBody TestJson testJson){
        System.out.println(testJson.getTextColumn());
        return testService.testinsert(testJson);
    }

    @RequestMapping("/testfetchjson")
    public Object testFetchJson(){
        return testService.testFetchJson();
    }

    @RequestMapping("/testListMapJson")
    public Object testListMapJson() {
//        List<Map<String,Object>> listMap = new ArrayList<Map<String,Object>>();
        List<TestList> listMap = new ArrayList<>();
        TestList tempItem = new TestList();
        tempItem.setHeight(200);
        tempItem.setWidth(200);
        tempItem.setZindex(300);
        Map<String, Object> tempMap1 = new HashMap<String, Object>();
        tempMap1.put("deg", 100);
        tempMap1.put("legendvis", true);
        Map<String, Object> tempMap2 = new HashMap<String, Object>();
        int[][] intList = new int[3][4];
        tempMap2.put("data", intList);
        tempMap2.put("url", "hello, doomish");
        tempItem.setStyle(tempMap1);
        tempItem.setDataSource(tempMap2);
        listMap.add(tempItem);
        return listMap;
    }

    @RequestMapping("/testGetListMapJson")
    public Object testGetListMapJson(@RequestBody List<TestList> testList){
        System.out.println(testList.toString());
//        System.out.println(testList);
//        System.out.println(testJson.getTextColumn());
        return 0;
    }
}
