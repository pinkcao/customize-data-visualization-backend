package pers.tornado.datav.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.tornado.datav.entity.DatavTemplateComponentStyleVo;
import pers.tornado.datav.mapper.DatavTemplateComponentStyleMapper;
import pers.tornado.datav.service.DatavTemplateComponentStyleService;

@Service
@Transactional
public class DatavTemplateComponentStyleServiceImpl implements DatavTemplateComponentStyleService {

    private final DatavTemplateComponentStyleMapper datavTemplateComponentStyleMapper;

    public DatavTemplateComponentStyleServiceImpl(DatavTemplateComponentStyleMapper datavTemplateComponentStyleMapper) {
        this.datavTemplateComponentStyleMapper = datavTemplateComponentStyleMapper;
    }


    @Override
    public int insertOneStyle(DatavTemplateComponentStyleVo datavTemplateComponentStyleVo) {
        return datavTemplateComponentStyleMapper.insertOneStyle(datavTemplateComponentStyleVo);
    }

    @Override
    public int updateOneStyle(DatavTemplateComponentStyleVo datavTemplateComponentStyleVo) {
        return datavTemplateComponentStyleMapper.updateOneStyle(datavTemplateComponentStyleVo);
    }
}
