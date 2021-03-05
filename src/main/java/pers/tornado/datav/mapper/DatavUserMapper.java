package pers.tornado.datav.mapper;

import org.apache.ibatis.annotations.Mapper;
import pers.tornado.datav.entity.DatavUser;

import java.util.List;

@Mapper
public interface DatavUserMapper {
    List<DatavUser> getAllDatavUser();
    DatavUser getOneDataUser(DatavUser datavUser);
    int validateAccount(DatavUser datavUser);
    int insertOneUser(DatavUser datavUser);
}
