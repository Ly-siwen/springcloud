package cn.siwen.config;

import cn.siwen.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * @author LY
 * @create 2020-11-12 10:53
 */
@Component
@FeignClient(value = "PAYMENT")
public interface OpenFeignService {
    @GetMapping("/find/{id}")
    public CommonResult openfeign(@PathVariable("id") Long id);
}
