package cn.gov.zcy.b;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableDubbo
@SpringBootApplication
public class ConsumerSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerSpringbootApplication.class,args);
    }

}
