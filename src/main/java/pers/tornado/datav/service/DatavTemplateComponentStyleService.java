package pers.tornado.datav.service;

import pers.tornado.datav.entity.DatavTemplateComponentStyleVo;

public interface DatavTemplateComponentStyleService {

    int insertOneStyle(int templateID, int index);
    int updateOneStyle(DatavTemplateComponentStyleVo datavTemplateComponentStyleVo);

}
