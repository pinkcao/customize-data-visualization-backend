package pers.tornado.datav.service;

import pers.tornado.datav.entity.DatavTemplate;
import pers.tornado.datav.entity.DatavUser;

import java.util.List;

public interface DatavTemplateService {
    List<DatavTemplate> getAllDatavTemplate();
    List<DatavTemplate> getDatavUserTemplate(int userID);
}
