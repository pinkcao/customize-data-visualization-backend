package pers.tornado.datav.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.tornado.datav.entity.DatavTemplateComponentStyleVo;
import pers.tornado.datav.mapper.DatavTemplateComponentStyleMapper;
import pers.tornado.datav.service.DatavTemplateComponentStyleService;

@Service
@Transactional
public class DatavTemplateComponentStyleServiceImpl implements DatavTemplateComponentStyleService {

    @Autowired
    private DatavTemplateComponentStyleMapper datavTemplateComponentStyleMapper;


    @Override
    public int insertOneStyle(int templateID, int index) {
        return datavTemplateComponentStyleMapper.insertOneStyle(templateID, index);
    }

    @Override
    public int updateOneStyle(DatavTemplateComponentStyleVo datavTemplateComponentStyleVo) {
        return datavTemplateComponentStyleMapper.updateOneStyle(datavTemplateComponentStyleVo);
    }
}
