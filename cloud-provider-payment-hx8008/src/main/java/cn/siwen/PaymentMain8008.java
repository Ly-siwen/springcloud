package cn.siwen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author LY
 * @create 2020-11-16 11:14
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class PaymentMain8008 {
    public static void main(String[] args) {
        SpringApplication.run(
                PaymentMain8008.class,args);
    }
}
