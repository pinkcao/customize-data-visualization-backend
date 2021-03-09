package pers.tornado.datav.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.tornado.datav.entity.DatavUser;
import pers.tornado.datav.mapper.DatavUserMapper;
import pers.tornado.datav.service.DatavUserService;

import java.util.List;
@Transactional
@Service
public class DatavUserServiceImpl implements DatavUserService {

    @Autowired
    private DatavUserMapper datavUserMapper;

    @Override
    public List<DatavUser> getAllDatavUser() {
        return datavUserMapper.getAllDatavUser();
    }

    @Override
    public DatavUser getOneDatavUser(DatavUser datavUser) {
        return datavUserMapper.getOneDataUser(datavUser);
    }

    @Override
    public int validateAccount(DatavUser datavUser) {
        return datavUserMapper.validateAccount(datavUser);
    }

    @Override
    public int insertOneUser(DatavUser datavUser) {
        return datavUserMapper.insertOneUser(datavUser);
    }
}
