package springframework.di.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springframework.di.config.AppConfiguration;
import springframework.di.setter.SetterBasedInjection;

/**
 * @Author: guohongwu
 * @Date: 2021/3/27 上午10:59
 */
public class TestSetterApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        SetterBasedInjection setterBasedInjection = applicationContext.getBean(SetterBasedInjection.class);
        setterBasedInjection.processMsg("twitter message sending ");
    }
}
