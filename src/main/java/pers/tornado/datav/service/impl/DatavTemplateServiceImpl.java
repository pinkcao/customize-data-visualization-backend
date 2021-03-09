package pers.tornado.datav.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.tornado.datav.entity.DatavTemplate;
import pers.tornado.datav.entity.DatavTemplateScreenStretchRef;
import pers.tornado.datav.entity.DatavUser;
import pers.tornado.datav.mapper.DatavTemplateMapper;
import pers.tornado.datav.service.DatavTemplateService;

import java.util.List;

@Service
public class DatavTemplateServiceImpl implements DatavTemplateService {

    @Autowired
    private DatavTemplateMapper datavTemplateMapper;

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

}
