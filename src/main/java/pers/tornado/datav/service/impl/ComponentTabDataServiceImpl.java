package pers.tornado.datav.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.tornado.datav.entity.ComponentTabData;
import pers.tornado.datav.mapper.ComponentTabDataMapper;
import pers.tornado.datav.service.ComponentTabDataService;

import java.util.List;

@Service
public class ComponentTabDataServiceImpl implements ComponentTabDataService {

    @Autowired
    private ComponentTabDataMapper componentTabDataMapper;

    @Override
    public List<ComponentTabData> getComponentTabData() {
        return componentTabDataMapper.getAllComponentTabData();
    }
}
