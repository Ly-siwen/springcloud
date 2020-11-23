package cn.siwen.service.impl;

import cn.siwen.service.PaymentService;
import cn.siwen.dao.PayMentDao;
import cn.siwen.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author LY
 * @create 2020-11-02 11:28
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PayMentDao payMentDao;

    @Override
    public int addPayMent(Payment payment) {
        return payMentDao.addPayMent(payment);
    }

    @Override
    public Payment fidPayMent(long id) {
        return payMentDao.fidPayMent(id);
    }
}
