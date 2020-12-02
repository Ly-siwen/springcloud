package cn.siwen.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author LY
 * @create 2020-12-02 10:34
 */
@Service
@FeignClient(value = "alibaba-payment-nacos")
public interface ConsumerService {
    @GetMapping(value = "/payment/{id}")
    public String findById(@PathVariable("id") Integer id);
}
