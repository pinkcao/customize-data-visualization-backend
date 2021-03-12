package pers.tornado.datav.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.tornado.datav.entity.ComponentDetail;
import pers.tornado.datav.mapper.ComponentDetailMapper;
import pers.tornado.datav.service.ComponentDetailService;

import java.util.List;

@Transactional
@Service
public class ComponentDetailServiceImpl implements ComponentDetailService {

    private final ComponentDetailMapper componentDetailMapper;

    public ComponentDetailServiceImpl(ComponentDetailMapper componentDetailMapper) {
        this.componentDetailMapper = componentDetailMapper;
    }

    public List<ComponentDetail> getAllComponentDetail() {
        return componentDetailMapper.getAllComponentDetail();
    }
}
