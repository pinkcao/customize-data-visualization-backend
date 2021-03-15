package pers.tornado.datav.mapper;


import org.apache.ibatis.annotations.Mapper;
import pers.tornado.datav.entity.DatavTemplateComponentStyle;
import pers.tornado.datav.entity.DatavTemplateComponentStyleVo;

@Mapper
public interface DatavTemplateComponentStyleMapper {

    int insertOneStyle(DatavTemplateComponentStyleVo datavTemplateComponentStyleVo);
    DatavTemplateComponentStyle selectStyleByIndex(int templateID, int component_index);
    int updateOneStyle(DatavTemplateComponentStyleVo datavTemplateComponentStyleVo);

}
