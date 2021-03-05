package pers.tornado.datav.exception;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Object allExceptionHandler(HttpServletRequest request,HttpServletResponse response,Exception exception) {

        Map<String,Object> map = new HashMap<String,Object>();

        map.put("error:", exception.getMessage());
        System.out.println(exception.getMessage());
        return map;
    }
}
