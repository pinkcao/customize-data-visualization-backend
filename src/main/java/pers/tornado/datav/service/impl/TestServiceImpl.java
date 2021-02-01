package pers.tornado.datav.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.tornado.datav.entity.TestJson;
import pers.tornado.datav.mapper.TestMapper;
import pers.tornado.datav.service.TestService;

import java.util.LinkedHashMap;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    public List<LinkedHashMap<String, Object>> superManagerSelect(String sql) {
        return testMapper.superManagerSelect(sql);
    }

    @Override
    public boolean testinsert(TestJson testJson) {
        return testMapper.testInsert(testJson) > 0;
    }

    @Override
    public List<TestJson> testFetchJson() {
        return testMapper.testFetchJson();
    }
}
