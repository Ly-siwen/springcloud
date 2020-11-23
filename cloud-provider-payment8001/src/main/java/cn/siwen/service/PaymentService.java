package cn.siwen.service;

import cn.siwen.entity.Payment;

/**
 * @author LY
 * @create 2020-11-02 11:27
 */
public interface PaymentService {
    public int addPayMent(Payment payment);

    public Payment fidPayMent(long id);
}
