package cn.siwen.controller;

import cn.siwen.service.ConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author LY
 * @create 2020-12-02 10:36
 */
@RestController
public class ConsumerController {
    @Resource
    private ConsumerService consumerService;

    @GetMapping(value = "/consumer/{id}")
    public String findById(@PathVariable("id") Integer id){
    return  consumerService.findById(id);
    }
}
