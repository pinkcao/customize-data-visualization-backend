package pers.tornado.datav.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pers.tornado.datav.filter.CrosFilter;

@Configuration
public class WebConfig {
    @Bean
    public FilterRegistrationBean crosFilterReg() {
        FilterRegistrationBean filterReg = new FilterRegistrationBean();

        filterReg.setFilter(new CrosFilter());

        filterReg.addUrlPatterns("/*");

        filterReg.setOrder(1);

        return filterReg;
    }


}
