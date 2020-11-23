package cn.siwen.config;

import cn.siwen.entity.CommonResult;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author LY
 * @create 2020-11-12 11:00
 */
public class OpenFeignServiceImpl implements OpenFeignService{
    @Value("${server.port}")
    private String port;

    @Override
    public CommonResult openfeign(Long id) {
        return new CommonResult(200,"sucess","端口号:"+port);
    }
}
