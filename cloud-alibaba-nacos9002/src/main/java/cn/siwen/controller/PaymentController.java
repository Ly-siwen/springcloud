package cn.siwen.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LY
 * @create 2020-12-02 10:28
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private  String port;

    @GetMapping(value = "/payment/{id}")
    public String findById(@PathVariable Integer id){
        return "欢迎使用Nacos,当前端口号为:"+port;
    }
}
