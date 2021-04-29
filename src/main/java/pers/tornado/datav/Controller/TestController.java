package pers.tornado.datav.Controller;

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

    private final TestService testService;
    private final String[] departmentName = {"finance", "HR", "sales", "QA", "develop", "product", "market", "departmentA", "departmentB"};
    private final String[] year = {"2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021"};

    public TestController(TestService testService) {
        this.testService = testService;
    }

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
        Map<String, Object> tempMap1 = new HashMap<>();
        tempMap1.put("deg", 100);
        tempMap1.put("legendvis", true);
        Map<String, Object> tempMap2 = new HashMap<>();
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
        return 0;
    }

    @RequestMapping("testJsonData")
    public Object testJsonData() {
        int scaleX = (int)(Math.random() * 4) + 2;
        int scaleY = (int)(Math.random() * 6) + 2;
        ArrayList<ArrayList> result = new ArrayList<>();
        ArrayList<String> firstRow = new ArrayList<>();
        firstRow.add("department");
        for (int i = 0; i < scaleX; i++) {
            firstRow.add(year[i]);
        }
        result.add(firstRow);

        for (int i = 0; i < scaleY; i++) {
            ArrayList<Object> temp = new ArrayList<>();
            temp.add(departmentName[i]);
            for (int j = 0; j < scaleX; j++) {
                temp.add((int)(Math.random() * 500) + 100);
            }
            result.add(temp);
        }
//        System.out.println(result.toString());
        return result;
    }
}
