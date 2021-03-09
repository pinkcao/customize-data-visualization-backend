package pers.tornado.datav.mapper;

import org.apache.ibatis.annotations.Mapper;
import pers.tornado.datav.entity.DatavTemplate;
import pers.tornado.datav.entity.DatavTemplateBackgroundVo;
import pers.tornado.datav.entity.DatavTemplateScreendef;

import java.util.List;

@Mapper
public interface DatavTemplateScreenMapper {
    List<DatavTemplateScreendef> getTemplateScreendefWithID(int templateID);
    List<DatavTemplateScreendef> getScreendefWithID(int templateID);
    int updateScreendefWithID(DatavTemplateScreendef datavTemplateScreendef);
    int getScreenStretchWithID(int templateID);
    int updateScreenStretchWithID(DatavTemplate datavTemplate);
    int updateBackgroundWithID(DatavTemplateBackgroundVo datavTemplateBackgroundVo);
}
