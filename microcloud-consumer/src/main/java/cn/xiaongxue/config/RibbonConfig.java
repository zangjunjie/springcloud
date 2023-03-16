package cn.xiaongxue.config;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;

/**
 * @description:
 * @author: ZJW
 * @time: 2023/3/16 13:00
 */
public class RibbonConfig {
    @Bean
    public IRule ribbonRule(){
        return new com.netflix.loadbalancer.RandomRule();//随机策略
    }
}
