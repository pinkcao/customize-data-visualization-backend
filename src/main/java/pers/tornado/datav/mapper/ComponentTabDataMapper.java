package pers.tornado.datav.mapper;

import org.apache.ibatis.annotations.Mapper;
import pers.tornado.datav.entity.ComponentTabData;

import java.util.List;

@Mapper
public interface ComponentTabDataMapper {
    List<ComponentTabData> getAllComponentTabData();
}
