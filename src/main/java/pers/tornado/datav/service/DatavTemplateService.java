package pers.tornado.datav.service;

import pers.tornado.datav.entity.DatavTemplate;
import pers.tornado.datav.entity.DatavTemplateScreenStretchRef;
import pers.tornado.datav.entity.DatavUser;

import java.util.List;

public interface DatavTemplateService {
    List<DatavTemplate> getAllDatavTemplate();
    List<DatavTemplate> getDatavUserTemplate(int userID);
    DatavTemplate getOneTemplate(int templateID);
    List<DatavTemplateScreenStretchRef> getRef();
    int insertUserTemplate(DatavTemplate datavTemplate);
    int insertUserTemplateScreenDef(int templateID);
    int spliceTemplate(DatavTemplate datavTemplate);
    int deleteAllDisabledTemplate();
}
