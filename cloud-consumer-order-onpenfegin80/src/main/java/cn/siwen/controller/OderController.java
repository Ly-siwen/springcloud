package cn.siwen.controller;

import cn.siwen.config.OpenFeignService;
import cn.siwen.entity.CommonResult;
import cn.siwen.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author LY
 * @create 2020-11-04 9:56
 */
@RestController
public class OderController {
    @Autowired
    private OpenFeignService openFeignService;

    @GetMapping(value = "consume/find/{id}")
    public CommonResult findOder(@PathVariable Long id){

        return openFeignService.openfeign(id);
    }


}
