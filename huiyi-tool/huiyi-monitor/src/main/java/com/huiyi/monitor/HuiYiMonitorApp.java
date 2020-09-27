package com.huiyi.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class HuiYiMonitorApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(HuiYiMonitorApp.class, args);
    }
}