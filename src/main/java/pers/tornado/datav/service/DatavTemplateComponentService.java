package pers.tornado.datav.service;

import pers.tornado.datav.entity.DatavTemplateComponent;

import java.util.List;

public interface DatavTemplateComponentService {

    int insertOneTemplateComponent(DatavTemplateComponent datavTemplateComponent);
    List<DatavTemplateComponent> selectComponentByID(int templateID);

}
