package pers.tornado.datav.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.tornado.datav.entity.ComponentDetail;
import pers.tornado.datav.mapper.ComponentDetailMapper;
import pers.tornado.datav.service.ComponentDetailService;

import java.util.List;

@Service
public class ComponentDetailServiceImpl implements ComponentDetailService {

    @Autowired
    private ComponentDetailMapper componentDetailMapper;

    public List<ComponentDetail> getAllComponentDetail() {
        return componentDetailMapper.getAllComponentDetail();
    }
}
