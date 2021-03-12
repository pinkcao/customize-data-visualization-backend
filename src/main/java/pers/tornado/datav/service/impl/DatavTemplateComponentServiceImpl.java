package pers.tornado.datav.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.tornado.datav.entity.DatavTemplateComponent;
import pers.tornado.datav.mapper.DatavTemplateComponentMapper;
import pers.tornado.datav.service.DatavTemplateComponentService;

import java.util.List;

@Service
@Transactional
public class DatavTemplateComponentServiceImpl implements DatavTemplateComponentService {

    public final DatavTemplateComponentMapper datavTemplateComponentMapper;

    public DatavTemplateComponentServiceImpl(DatavTemplateComponentMapper datavTemplateComponentMapper) {
        this.datavTemplateComponentMapper = datavTemplateComponentMapper;
    }

    public int insertOneTemplateComponent(DatavTemplateComponent datavTemplateComponent) {
        return datavTemplateComponentMapper.insertOneTemplateComponent(datavTemplateComponent);
    }

    @Override
    public List<DatavTemplateComponent> selectComponentByID(int templateID) {
        return datavTemplateComponentMapper.selectComponentByID(templateID);
    }

    @Override
    public int adjustComponent(DatavTemplateComponent datavTemplateComponent) {
        return datavTemplateComponentMapper.adjustComponent(datavTemplateComponent);
    }

    @Override
    public int updateOneComponent(DatavTemplateComponent datavTemplateComponent) {
        return datavTemplateComponentMapper.updateOneComponent(datavTemplateComponent);
    }

    @Override
    public int spliceOneComponent(DatavTemplateComponent datavTemplateComponent) {
        return datavTemplateComponentMapper.spliceOneComponent(datavTemplateComponent);
    }

    @Override
    public int getTemplateBiggestIndex(int templateID) {
        return datavTemplateComponentMapper.getTemplateBiggestIndex(templateID);
    }

    @Override
    public int getTemplateBiggestZindex(int templateID) {
        return datavTemplateComponentMapper.getTemplateBiggestZindex(templateID);
    }

    @Override
    public int updateComponentZindex(DatavTemplateComponent datavTemplateComponent) {
        return datavTemplateComponentMapper.updateComponentZindex(datavTemplateComponent);
    }
}
