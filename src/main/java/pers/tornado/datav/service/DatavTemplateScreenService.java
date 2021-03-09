package pers.tornado.datav.service;

import pers.tornado.datav.entity.DatavTemplate;
import pers.tornado.datav.entity.DatavTemplateBackgroundVo;
import pers.tornado.datav.entity.DatavTemplateScreendef;

import java.util.List;

public interface DatavTemplateScreenService {

    List<DatavTemplateScreendef> getTemplateScreendef(int templateID);
    int updateScreendefWithID(DatavTemplateScreendef datavTemplateScreendef);
    int getScreenStretchWithID(int templateID);
    int updateScreenStretchWithID(DatavTemplate datavTemplate);
    int updateBackgroundWithID(DatavTemplateBackgroundVo datavTemplateBackgroundVo);
}
