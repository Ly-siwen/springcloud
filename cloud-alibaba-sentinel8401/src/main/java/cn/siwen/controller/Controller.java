package cn.siwen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LY
 * @create 2020-12-09 10:03
 */
@RestController
public class Controller {

    @GetMapping(value = "/testA")
    public String testA() throws InterruptedException {
        Thread.sleep(6000);
        return "-----------testA";
    }

    @GetMapping(value = "/testB")
    public String testB(){
        return "-----------testB";
    }
}
