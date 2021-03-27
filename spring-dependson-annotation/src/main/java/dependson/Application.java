package dependson;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: guohongwu
 * @Date: 2021/3/27 上午11:53
 */
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        FirstBean bean = context.getBean(FirstBean.class);
        bean.populateBeans();
        context.close();
    }
}
