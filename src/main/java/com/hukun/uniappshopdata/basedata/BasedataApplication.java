package com.hukun.uniappshopdata.basedata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hukun.uniappshopdata.basedata.mapper")
public class BasedataApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasedataApplication.class, args);
    }

}
