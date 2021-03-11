package pers.tornado.datav.service;

import pers.tornado.datav.entity.DatavTemplateComponentDataSource;
import pers.tornado.datav.entity.DatavTemplateComponentDataSourceVo;

public interface DatavTemplateComponentDataSourceService {

    int insertOneDataSource (DatavTemplateComponentDataSourceVo datavTemplateComponentDataSourceVo);
    int updateOneDataSource (DatavTemplateComponentDataSourceVo datavTemplateComponentDataSourceVo);

}
