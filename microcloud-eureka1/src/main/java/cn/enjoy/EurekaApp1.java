package cn.enjoy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description:
 * @author: ZJW
 * @time: 2023/3/15 10:18
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp1 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApp1.class,args);
    }
}
