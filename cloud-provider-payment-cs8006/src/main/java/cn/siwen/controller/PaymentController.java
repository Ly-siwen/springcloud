package cn.siwen.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author LY
 * @create 2020-11-11 15:46
 */
@RestController
@Log4j2
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/consul")
    public String paymentzk() {
        return "springcloud with consul:" + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
