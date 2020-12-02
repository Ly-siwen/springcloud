package cn.siwen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author LY
 * @create 2020-12-02 10:27
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class NacosConsumerMain83 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerMain83.class,args);
    }
}
