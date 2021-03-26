package pers.tornado.datav.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import pers.tornado.datav.utils.RedisUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TokenInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private RedisUtils redisUtils;


    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        // cope with preflight request
        if (request.getMethod().equals("OPTIONS")) {
//            System.out.println("pre-flight request,pass");
            return true;
        }

        //preset 401
        response.setStatus(401);
//        System.out.println(response.getStatus());
        System.out.println("拦截器生效");
        System.out.println(request.getRequestURL());
        int interceptFlag = (int) redisUtils.get(request.getHeader("Authorization"));
//        System.out.println(interceptFlag);
        if (interceptFlag >= 0) {
            response.setStatus(200);
//            System.out.println("到这里终止了");
            return true;
        }
//            if (interceptFlag == null) {
//                System.out.println("到底设置401没？");
//                response.setStatus(401);
//                return false;
//            }
//        System.out.println(response.getStatus());
        return false;

    }

}
