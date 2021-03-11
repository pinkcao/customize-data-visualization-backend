package pers.tornado.datav.mapper;

import org.apache.ibatis.annotations.Mapper;
import pers.tornado.datav.entity.DatavTemplateComponent;
import pers.tornado.datav.entity.DatavTemplateComponentDataSource;
import pers.tornado.datav.entity.DatavTemplateComponentDataSourceVo;
import pers.tornado.datav.entity.DatavTemplateComponentStyle;

@Mapper
public interface DatavTemplateComponentDataSourceMapper {

    int insertOneDataSource (DatavTemplateComponentDataSourceVo datavTemplateComponentDataSourceVo);
    DatavTemplateComponentDataSource selectDataSourceByIndex(int templateID, int component_index);
    int updateOneDataSource (DatavTemplateComponentDataSourceVo datavTemplateComponentDataSourceVo);

}
