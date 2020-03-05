package com.lim.bms.sys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 后台管理系统 - 系统管理
 * @author Lim
 * @date 2020/3/5
 */
@SpringBootApplication
@MapperScan("com.lim.bms.sys")
public class SystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class, args);
    }

}
