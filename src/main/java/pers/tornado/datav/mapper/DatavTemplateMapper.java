package pers.tornado.datav.mapper;

import org.apache.ibatis.annotations.Mapper;
import pers.tornado.datav.entity.DatavTemplate;
import pers.tornado.datav.entity.DatavTemplateScreenStretchRef;

import java.util.List;

@Mapper
public interface DatavTemplateMapper {
    List<DatavTemplate> getAllDatavTemplate();
    List<DatavTemplate> getDatavUserTemplate(int userID);
    DatavTemplate getOneTemplate(int templateID);
    List<DatavTemplateScreenStretchRef> getRef();
    int insertUserTemplate(DatavTemplate datavTemplate);
    int insertUserTemplateScreenDef(int templateID);
    int spliceTemplate(DatavTemplate datavTemplate);
    int deleteAllDisabledTemplate();
}
