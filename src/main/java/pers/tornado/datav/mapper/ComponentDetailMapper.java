package pers.tornado.datav.mapper;

import org.apache.ibatis.annotations.Mapper;
import pers.tornado.datav.entity.ComponentDetail;

import java.util.List;

@Mapper
public interface ComponentDetailMapper {
    List<ComponentDetail> getAllComponentDetail();
    List<ComponentDetail> selectByComponentTabDataDetailID(int componentTabDataDetailID);
}
