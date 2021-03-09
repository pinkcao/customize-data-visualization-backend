package pers.tornado.datav.service;

import pers.tornado.datav.entity.DatavTemplate;
import pers.tornado.datav.entity.DatavTemplateScreendef;

import java.util.List;

public interface DatavTemplateScreenService {

    List<DatavTemplateScreendef> getTemplateScreendef(int templateID);
    int updateScreendefWithID(DatavTemplateScreendef datavTemplateScreendef);
    int getScreenStretchWithID(int templateID);
}
