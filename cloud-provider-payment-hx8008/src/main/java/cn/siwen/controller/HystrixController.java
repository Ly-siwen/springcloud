package cn.siwen.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LY
 * @create 2020-11-16 11:18
 */
@RestController
public class HystrixController {



    @GetMapping(value = "/payment/hystrix/ok/{id}")
    //服务熔断
    @HystrixCommand(fallbackMethod = "uou",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")
    })
    public String paymentInfo_OK(@PathVariable Integer id){
        if(id<0){
            throw new RuntimeException("******id不能为负数");
        }
        return "OK你好"+id;
    }

    @GetMapping(value = "/payment/hystrix/timeout/{id}")
    //服务降级
    @HystrixCommand(fallbackMethod = "ouo",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1500")
    })
    public String paymentInfo_TimeOut(@PathVariable Integer id){
        int a=3000;
        try {
            Thread.sleep(a);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "timeout"+id+"延迟时间(毫秒):"+a;
    }


    public String ouo(@PathVariable Integer id){
        return "服务降级!!!";
    }

    public String uou(@PathVariable Integer id){
        return "服务熔断!!!";
    }
}
