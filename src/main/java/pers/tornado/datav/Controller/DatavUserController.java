package pers.tornado.datav.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.tornado.datav.entity.DatavUser;
import pers.tornado.datav.service.DatavUserService;
import pers.tornado.datav.utils.RedisUtils;
import pers.tornado.datav.utils.TokenProcessor;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/api/user")
public class DatavUserController {

    private final RedisUtils redisUtils;

    private final DatavUserService datavUserService;

    public DatavUserController(DatavUserService datavUserService, RedisUtils redisUtils) {
        this.datavUserService = datavUserService;
        this.redisUtils = redisUtils;
    }

    @RequestMapping("/getAllUser")
    public Object getAllUser() {
        return datavUserService.getAllDatavUser();
    }

    @RequestMapping("/login")
    public Object userLogin(@RequestBody DatavUser datavUser) {

        DatavUser tempUser = datavUserService.getOneDatavUser(datavUser);
        Map<String, Object> result = new HashMap<>();
        if (tempUser != null) {
            result.put("loginStatus", true);
            result.put("userID", tempUser.getuserID());
            String token = TokenProcessor.getInstance().makeToken();
//            redisUtils.set(token, 1, 30, TimeUnit.MINUTES);
            redisUtils.set(token, tempUser.getuserID(), 7, TimeUnit.DAYS);
            result.put("token", token);
        } else {
            result.put("loginStatus", false);
        }
        return result;
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
        Map<String, Object> result = new HashMap<>();

        if (tempUser > 0) {
            result.put("registerStatus", true);
        } else {
            result.put("registerStatus", false);
        }
        return result;
    }

    @RequestMapping("refreshLoginStatus")
    public Object refreshLoginStatus(@RequestParam int userID) {
        Map<String, Object> map = new HashMap<>();
        String token = TokenProcessor.getInstance().makeToken();
        redisUtils.set(token, userID, 7, TimeUnit.DAYS);
        map.put("token", token);
        map.put("loginStatus", true);
        return map;
    }
}
