package pers.tornado.datav.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.tornado.datav.entity.DatavTemplateComponentDataSource;
import pers.tornado.datav.entity.DatavTemplateComponentDataSourceVo;
import pers.tornado.datav.mapper.DatavTemplateComponentDataSourceMapper;
import pers.tornado.datav.service.DatavTemplateComponentDataSourceService;

@Service
@Transactional
public class DatavTemplateComponentDataSourceServiceImpl implements DatavTemplateComponentDataSourceService {

    @Autowired
    private DatavTemplateComponentDataSourceMapper datavTemplateComponentDataSourceMapper;

    @Override
    public int insertOneDataSource(DatavTemplateComponentDataSourceVo datavTemplateComponentDataSourceVo) {
        return datavTemplateComponentDataSourceMapper.insertOneDataSource(datavTemplateComponentDataSourceVo);
    }

    @Override
    public int updateOneDataSource(DatavTemplateComponentDataSourceVo datavTemplateComponentDataSourceVo) {
        return datavTemplateComponentDataSourceMapper.updateOneDataSource(datavTemplateComponentDataSourceVo);
    }
}
