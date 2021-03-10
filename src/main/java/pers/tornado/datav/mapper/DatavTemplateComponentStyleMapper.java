package pers.tornado.datav.mapper;


import org.apache.ibatis.annotations.Mapper;
import pers.tornado.datav.entity.DatavTemplateComponentStyle;

@Mapper
public interface DatavTemplateComponentStyleMapper {

    int insertOneStyle(int templateID, int index);
    DatavTemplateComponentStyle selectStyleByIndex(int templateID, int component_index);

}
