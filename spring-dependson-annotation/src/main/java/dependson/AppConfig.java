package dependson;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

/**
 * @Author: guohongwu
 * @Date: 2021/3/27 上午11:46
 */
@Configuration
public class AppConfig {

    @Bean("firstBean")
/*    @DependsOn(value = {
            "secondBean",
            "thirdBean"
    })*/
    public FirstBean firstBean() {
        return new FirstBean();
    }

    @Bean("secondBean")
    public SecondBean secondBean() {
        return new SecondBean();
    }

    @Bean("thirdBean")
    public ThirdBean thirdBean() {
        return new ThirdBean();
    }

}
