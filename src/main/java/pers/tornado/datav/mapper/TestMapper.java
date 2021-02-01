package pers.tornado.datav.mapper;

import org.apache.ibatis.annotations.Mapper;
import pers.tornado.datav.entity.TestJson;

import java.util.LinkedHashMap;
import java.util.List;

@Mapper
public interface TestMapper {
    List<LinkedHashMap<String, Object>> superManagerSelect(String sql);
    int testInsert(TestJson testJson);
    List<TestJson> testFetchJson();
//    Boolean
}
