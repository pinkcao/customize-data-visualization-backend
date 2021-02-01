package pers.tornado.datav.service;

import pers.tornado.datav.entity.TestJson;

import java.util.LinkedHashMap;
import java.util.List;

public interface TestService {

    List<LinkedHashMap<String, Object>> superManagerSelect(String sql);
    boolean testinsert(TestJson testJson);
    List<TestJson> testFetchJson();
}
