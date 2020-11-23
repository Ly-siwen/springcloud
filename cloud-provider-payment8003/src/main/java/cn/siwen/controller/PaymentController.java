package cn.siwen.controller;

import cn.siwen.entity.CommonResult;
import cn.siwen.entity.Payment;
import cn.siwen.service.impl.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author LY
 * @create 2020-11-02 11:29
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String port;
    @Autowired
    private PaymentServiceImpl paymentService;

    @PostMapping(value = "/add")
    public CommonResult addPayment(@RequestBody Payment payment){
        int result= paymentService.addPayMent(payment);
        if(result>0){
            return  new CommonResult(200,"sucess","端口号:"+port);
        }else
            return new CommonResult(404,"firld");
    }

    @GetMapping(value = "/find/{id}")
    public CommonResult findPayment(@PathVariable long id) {
        Payment payment = paymentService.fidPayMent(id);
        if (payment != null) {
            return new CommonResult(200, "sucess", "端口号:"+port);
        } else
            return new CommonResult(404, "firld");
    }

}
