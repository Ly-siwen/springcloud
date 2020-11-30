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
public class StreamMain8802 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMain8802.class,args);
    }
}
