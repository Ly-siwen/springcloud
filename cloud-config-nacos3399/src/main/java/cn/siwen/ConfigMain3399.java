package cn.siwen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author LY
 * @create 2020-12-03 10:06
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigMain3399 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigMain3399.class,args);
    }
}
