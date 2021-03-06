package pers.tornado.datav.service;

import pers.tornado.datav.entity.DatavTemplateComponent;

import java.util.List;

public interface DatavTemplateComponentService {

    int insertOneTemplateComponent(DatavTemplateComponent datavTemplateComponent);
    List<DatavTemplateComponent> selectComponentByID(int templateID);
    int adjustComponent(DatavTemplateComponent datavTemplateComponent);
    int updateOneComponent(DatavTemplateComponent datavTemplateComponent);
    int spliceOneComponent(DatavTemplateComponent datavTemplateComponent);
    int getTemplateBiggestIndex(int templateID);
    int getTemplateBiggestZindex(int templateID);
    int updateComponentZindex(DatavTemplateComponent datavTemplateComponent);

}
