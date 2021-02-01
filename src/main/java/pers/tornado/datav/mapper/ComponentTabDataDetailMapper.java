package pers.tornado.datav.mapper;

import org.apache.ibatis.annotations.Mapper;
import pers.tornado.datav.entity.ComponentTabDataDetail;

import java.util.List;

@Mapper
public interface ComponentTabDataDetailMapper {
    List<ComponentTabDataDetail> getAllComponentTabDataDetail();
    List<ComponentTabDataDetail> selectByShowDataID(int showDataID);
}
