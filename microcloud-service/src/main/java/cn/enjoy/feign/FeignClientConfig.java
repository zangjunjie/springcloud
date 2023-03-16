package cn.enjoy.feign;


import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: ZJW
 * @time: 2023/3/16 21:55
 */
@Configuration
public class FeignClientConfig {
    @Bean
    public BasicAuthRequestInterceptor getBasicAuthRequestInterceptor(){
        return new BasicAuthRequestInterceptor("admin","enjoy");
    }
    @Bean
    public Logger.Level getFeignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
