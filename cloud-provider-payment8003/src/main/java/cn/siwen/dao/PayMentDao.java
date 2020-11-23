package cn.siwen.dao;

import cn.siwen.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author LY
 * @create 2020-11-02 11:12
 */
@Mapper
public interface PayMentDao {
    public int addPayMent(Payment payment);

    public Payment fidPayMent(@Param("id") long id);
}
