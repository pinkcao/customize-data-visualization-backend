package pers.tornado.datav.mapper;

import org.apache.ibatis.annotations.Mapper;
import pers.tornado.datav.entity.DatavTemplateComponent;

import java.util.List;

@Mapper
public interface DatavTemplateComponentMapper {

    int insertOneTemplateComponent(DatavTemplateComponent datavTemplateComponent);
    List<DatavTemplateComponent> selectComponentByID(int templateID);

}
