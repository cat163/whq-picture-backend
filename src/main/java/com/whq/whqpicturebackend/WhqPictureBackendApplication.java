package com.whq.whqpicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.whq.whqpicturebackend.mapper")
@EnableAspectJAutoProxy(proxyTargetClass = true)  // 增强代理类
public class WhqPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(WhqPictureBackendApplication.class, args);
    }

}
