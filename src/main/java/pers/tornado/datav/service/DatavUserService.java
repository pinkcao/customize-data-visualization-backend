package pers.tornado.datav.service;

import pers.tornado.datav.entity.DatavUser;

import java.util.List;

public interface DatavUserService {
    List<DatavUser> getAllDatavUser();
    DatavUser getOneDatavUser(DatavUser datavUser);
    int validateAccount(DatavUser datavUser);
    int insertOneUser(DatavUser datavUser);
}
