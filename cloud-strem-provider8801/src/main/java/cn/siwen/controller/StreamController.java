package cn.siwen.controller;

import cn.siwen.service.impl.MassgeServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author LY
 * @create 2020-11-30 16:35
 */
@RestController
public class StreamController {
    @Resource
    private MassgeServiceImpl massgeService;

    @GetMapping(value = "/sendMassge")
    public String sendMassge(){
        return massgeService.send();
    }
}
