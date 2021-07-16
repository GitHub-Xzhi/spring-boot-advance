package org.xzhi.eurekaserverb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka注册中心服务
 *
 * @author Xzhi
 * @date 2021-07-15 15:12
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerBApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerBApp.class, args);
    }
}