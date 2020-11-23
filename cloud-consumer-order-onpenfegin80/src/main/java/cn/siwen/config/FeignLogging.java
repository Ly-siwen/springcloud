package cn.siwen.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author LY
 * @create 2020-11-12 11:31
 */
@Configuration
public class FeignLogging {
    @Bean
    Logger.Level feignLogger(){
        return Logger.Level.FULL;
    }
}
