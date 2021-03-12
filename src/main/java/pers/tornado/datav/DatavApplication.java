package pers.tornado.datav;

import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@MapperScan("pers.tornado.datav.mapper")
public class DatavApplication {

//    private static final Logger LOGGER = Logger.getLogger(DatavApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DatavApplication.class, args);

//        LOGGER.debug("this is test message");
    }

}
