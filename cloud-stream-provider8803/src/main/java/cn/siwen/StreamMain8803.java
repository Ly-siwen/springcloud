package cn.siwen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author LY
 * @create 2020-11-30 16:46
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamMain8803 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMain8803.class,args);
    }
}
