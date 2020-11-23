package cn.siwen.controller;

import cn.siwen.entity.CommonResult;
import cn.siwen.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import javax.xml.transform.Templates;

/**
 * @author LY
 * @create 2020-11-04 9:56
 */
@RestController
public class OderController {
    private static final String PAYMENT_PATH="http://PAYMENT";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "consume/find/{id}")
    public CommonResult findOder(@PathVariable Integer id){
        return restTemplate.getForObject(PAYMENT_PATH+"/find/"+id,CommonResult.class,id);
    }

    @GetMapping(value = "consume/add")
    public CommonResult addOrder(Payment payment){
        return restTemplate.postForObject(PAYMENT_PATH+"/add",payment,CommonResult.class);
    }
}
