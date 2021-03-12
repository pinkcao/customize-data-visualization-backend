package pers.tornado.datav.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.tornado.datav.entity.DatavTemplateComponentDataSourceVo;
import pers.tornado.datav.mapper.DatavTemplateComponentDataSourceMapper;
import pers.tornado.datav.service.DatavTemplateComponentDataSourceService;

@Service
@Transactional
public class DatavTemplateComponentDataSourceServiceImpl implements DatavTemplateComponentDataSourceService {

    private final DatavTemplateComponentDataSourceMapper datavTemplateComponentDataSourceMapper;

    public DatavTemplateComponentDataSourceServiceImpl(DatavTemplateComponentDataSourceMapper datavTemplateComponentDataSourceMapper) {
        this.datavTemplateComponentDataSourceMapper = datavTemplateComponentDataSourceMapper;
    }

    @Override
    public int insertOneDataSource(DatavTemplateComponentDataSourceVo datavTemplateComponentDataSourceVo) {
        return datavTemplateComponentDataSourceMapper.insertOneDataSource(datavTemplateComponentDataSourceVo);
    }

    @Override
    public int updateOneDataSource(DatavTemplateComponentDataSourceVo datavTemplateComponentDataSourceVo) {
        return datavTemplateComponentDataSourceMapper.updateOneDataSource(datavTemplateComponentDataSourceVo);
    }
}
