package com.huiyi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.huiyi.system.annotation.EnableRyFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.huiyi.*.mapper")
@EnableRyFeignClients
public class HuiYiGenApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(HuiYiGenApp.class, args);
    }
}
