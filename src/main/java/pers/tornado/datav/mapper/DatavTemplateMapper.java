package pers.tornado.datav.mapper;

import org.apache.ibatis.annotations.Mapper;
import pers.tornado.datav.entity.DatavTemplate;
import pers.tornado.datav.entity.DatavUser;

import java.util.List;

@Mapper
public interface DatavTemplateMapper {
    List<DatavTemplate> getAllDatavTemplate();
    List<DatavTemplate> getDatavUserTemplate(int userID);
}
