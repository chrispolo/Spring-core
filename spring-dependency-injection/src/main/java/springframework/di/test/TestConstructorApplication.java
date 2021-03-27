package springframework.di.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springframework.di.config.AppConfiguration;
import springframework.di.constructor.ConstructorBasedInjection;

/**
 * @Author: guohongwu
 * @Date: 2021/3/27 上午10:12
 */
public class TestConstructorApplication {

    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        ConstructorBasedInjection constructorBasedInjection = applicationContext.getBean(ConstructorBasedInjection.class);
        constructorBasedInjection.processMsg("twitter message sending");
    }
}
