package pers.tornado.datav.service.impl;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.tornado.datav.entity.ComponentTabData;
import pers.tornado.datav.mapper.ComponentTabDataMapper;
import pers.tornado.datav.service.ComponentTabDataService;

import java.util.List;

@Transactional
@Service
@CacheConfig(cacheNames = "'componentTabData'")
public class ComponentTabDataServiceImpl implements ComponentTabDataService {

    private final ComponentTabDataMapper componentTabDataMapper;

    public ComponentTabDataServiceImpl(ComponentTabDataMapper componentTabDataMapper) {
        this.componentTabDataMapper = componentTabDataMapper;
    }

    @Override
    @Cacheable(key = "'defaultTabData'")
    public List<ComponentTabData> getComponentTabData() {
        return componentTabDataMapper.getAllComponentTabData();
    }
}
