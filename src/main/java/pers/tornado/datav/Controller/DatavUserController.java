package pers.tornado.datav.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.tornado.datav.entity.DatavUser;
import pers.tornado.datav.service.DatavUserService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class DatavUserController {

    @Autowired
    private DatavUserService datavUserService;

    @RequestMapping("/getAllUser")
    public Object getAllUser() {
        return datavUserService.getAllDatavUser();
    }

    @RequestMapping("/login")
    public Object userLogin(@RequestBody DatavUser datavUser) {
//        System.out.println(datavUser.toString());
//        System.out.println(datavUserService.getOneDatavUser(datavUser).getuserID());


        DatavUser tempUser = datavUserService.getOneDatavUser(datavUser);
        Map<String, Object> result = new HashMap<String, Object>();
        if (tempUser != null) {
            result.put("loginStatus", true);
            result.put("userID", tempUser.getuserID());
            return result;
        } else {
            result.put("loginStatus", false);
            return result;
        }
    }

    @RequestMapping("/validateAccount")
    public Object validateAccount(@RequestBody DatavUser datavUser) {
        int tempResult = datavUserService.validateAccount(datavUser);
        return tempResult <= 0;
    }

    @RequestMapping("register")
    public Object userRegister(@RequestBody DatavUser datavUser) {

        //插入datav_user表，返回了操作的数据条数，并赋值给datavUser主键
        int tempUser = datavUserService.insertOneUser(datavUser);
        Map<String, Object> result = new HashMap<String, Object>();

        if (tempUser > 0) {
            result.put("registerStatus", true);
            return result;
        } else {
            result.put("registerStatus", false);
            return result;
        }

    }
}
