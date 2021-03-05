package pers.tornado.datav.mapper;

import org.apache.ibatis.annotations.Mapper;
import pers.tornado.datav.entity.DatavTemplateScreendef;

import java.util.List;

@Mapper
public interface DatavTemplateScreendefMapper {
    List<DatavTemplateScreendef> getTemplateScreendefWithID(int templateID);
}
