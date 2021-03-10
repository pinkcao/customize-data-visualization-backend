package pers.tornado.datav.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.tornado.datav.entity.DatavTemplateComponent;
import pers.tornado.datav.mapper.DatavTemplateComponentMapper;
import pers.tornado.datav.service.DatavTemplateComponentService;

import java.util.List;

@Service
@Transactional
public class DatavTemplateComponentServiceImpl implements DatavTemplateComponentService {

    @Autowired
    public DatavTemplateComponentMapper datavTemplateComponentMapper;

    public int insertOneTemplateComponent(DatavTemplateComponent datavTemplateComponent) {
        return datavTemplateComponentMapper.insertOneTemplateComponent(datavTemplateComponent);
    }

    @Override
    public List<DatavTemplateComponent> selectComponentByID(int templateID) {
        return datavTemplateComponentMapper.selectComponentByID(templateID);
    }
}
