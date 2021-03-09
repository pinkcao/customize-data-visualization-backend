package pers.tornado.datav.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.tornado.datav.entity.ComponentTabDataDetail;
import pers.tornado.datav.mapper.ComponentTabDataDetailMapper;
import pers.tornado.datav.service.ComponentTabDataDetailService;

import java.util.List;
@Transactional
@Service
public class ComponentTabDataDetailServiceImpl implements ComponentTabDataDetailService {
    @Autowired
    private ComponentTabDataDetailMapper componentTabDataDetailMapper;

    public List<ComponentTabDataDetail> getComponentTabDataDetailList() {
        return componentTabDataDetailMapper.getAllComponentTabDataDetail();
    }
}
