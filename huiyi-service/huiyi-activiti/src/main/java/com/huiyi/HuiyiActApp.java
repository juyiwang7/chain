package com.huiyi;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.huiyi.system.annotation.EnableRyFeignClients;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@EnableDiscoveryClient
@MapperScan("com.huiyi.*.mapper")
@EnableRyFeignClients
public class HuiyiActApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(HuiyiActApp.class, args);
    }
}
