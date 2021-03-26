package pers.tornado.datav.mapper;

import org.apache.ibatis.annotations.Mapper;
import pers.tornado.datav.entity.DatavTemplateComponent;

import java.util.List;

@Mapper
public interface DatavTemplateComponentMapper {

    int insertOneTemplateComponent(DatavTemplateComponent datavTemplateComponent);
    List<DatavTemplateComponent> selectComponentByID(int templateID);
    int adjustComponent(DatavTemplateComponent datavTemplateComponent);
    int updateComponentZindex(DatavTemplateComponent datavTemplateComponent);
    int updateOneComponent(DatavTemplateComponent datavTemplateComponent);
    int spliceOneComponent(DatavTemplateComponent datavTemplateComponent);
    int getTemplateBiggestIndex(int templateID);
    int getTemplateBiggestZindex(int templateID);
    DatavTemplateComponent selectDistinctComponent(int templateID, int component_index);
}
