package pers.tornado.datav.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.tornado.datav.entity.DatavTemplate;
import pers.tornado.datav.entity.DatavTemplateScreenStretchRef;
import pers.tornado.datav.mapper.DatavTemplateMapper;
import pers.tornado.datav.service.DatavTemplateService;

import java.util.List;

@Transactional
@Service
public class DatavTemplateServiceImpl implements DatavTemplateService {

    private final DatavTemplateMapper datavTemplateMapper;

    public DatavTemplateServiceImpl(DatavTemplateMapper datavTemplateMapper) {
        this.datavTemplateMapper = datavTemplateMapper;
    }

    @Override
    public List<DatavTemplate> getAllDatavTemplate() {
        return datavTemplateMapper.getAllDatavTemplate();
    }

    @Override
    public List<DatavTemplate> getDatavUserTemplate(int userID) {
        return datavTemplateMapper.getDatavUserTemplate(userID);
    }

    @Override
    public List<DatavTemplateScreenStretchRef> getRef() {
        return datavTemplateMapper.getRef();
    }

    @Override
    public int insertUserTemplate(DatavTemplate datavTemplate) {
        return datavTemplateMapper.insertUserTemplate(datavTemplate);
    }

    @Override
    public int insertUserTemplateScreenDef(int templateID) {
        return datavTemplateMapper.insertUserTemplateScreenDef(templateID);
    }

    @Override
    public int spliceTemplate(DatavTemplate datavTemplate) {
        return datavTemplateMapper.spliceTemplate(datavTemplate);
    }

    @Override
    public DatavTemplate getOneTemplate(int templateID) {
        return datavTemplateMapper.getOneTemplate(templateID);
    }

    @Override
    public int deleteAllDisabledTemplate() {
        return datavTemplateMapper.deleteAllDisabledTemplate();
    }
}
