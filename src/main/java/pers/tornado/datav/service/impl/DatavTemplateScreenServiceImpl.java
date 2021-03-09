package pers.tornado.datav.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.tornado.datav.entity.DatavTemplate;
import pers.tornado.datav.entity.DatavTemplateBackgroundVo;
import pers.tornado.datav.entity.DatavTemplateScreendef;
import pers.tornado.datav.mapper.DatavTemplateScreenMapper;
import pers.tornado.datav.service.DatavTemplateScreenService;

import java.util.List;

@Service
public class DatavTemplateScreenServiceImpl implements DatavTemplateScreenService {
    @Autowired
    private DatavTemplateScreenMapper datavTemplateScreenMapper;

    @Override
    public List<DatavTemplateScreendef> getTemplateScreendef(int templateID) {
        return datavTemplateScreenMapper.getScreendefWithID(templateID);
    }

    @Override
    public int updateScreendefWithID(DatavTemplateScreendef datavTemplateScreendef) {
        return datavTemplateScreenMapper.updateScreendefWithID(datavTemplateScreendef);
    }
    @Override
    public int getScreenStretchWithID(int templateID) {
        return datavTemplateScreenMapper.getScreenStretchWithID(templateID);
    }

    @Override
    public int updateScreenStretchWithID(DatavTemplate datavTemplate) {
        return datavTemplateScreenMapper.updateScreenStretchWithID(datavTemplate);
    }

    @Override
    public int updateBackgroundWithID(DatavTemplateBackgroundVo datavTemplateBackgroundVo) {
        return  datavTemplateScreenMapper.updateBackgroundWithID(datavTemplateBackgroundVo);
    }
}
