package pers.tornado.datav.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/*")
public class CrosFilter implements Filter {

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {


        HttpServletRequest req = (HttpServletRequest)request;
        HttpServletResponse res = (HttpServletResponse)response;

        res.setContentType("application/json;charset=utf-8");

        res.setHeader("Access-Control-Allow-Origin", req.getHeader("Origin"));
        res.setHeader("Access-Control-Allow-Credentials", "true");
        res.setHeader("Access-Control-Allow-Headers",
                "Accept,"
                        + "Origin,"
                        + "No-Cache,"
                        + "X-Requested-With,"
                        + "If-Modified-Since,"
                        + "Pragma,"
                        + "Last-Modified,"
                        + "Cache-Control,"
                        + "Expires,"
                        + "Authorization,"
                        + "Content-Type,"
                        + "X-E4M-With");

        //cope with preflight
        System.out.println("过滤器生效");
        if (req.getMethod().equals("OPTIONS")) {
            res.setStatus(200);
        }
        chain.doFilter(request, response);
    }
}