package cn.siwen.service.impl;

import cn.siwen.service.MassgeService;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author LY
 * @create 2020-11-30 16:37
 */
@Service
@EnableBinding(Source.class)
public class MassgeServiceImpl implements MassgeService {
    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial= UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("发送信息:"+serial);
        return null;
    }
}
