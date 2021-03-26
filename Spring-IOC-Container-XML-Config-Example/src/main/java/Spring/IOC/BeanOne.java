package Spring.IOC;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

/**
 * @Author: guohongwu
 * @Date: 2021/3/25 下午10:58
 */
@Component
public class BeanOne {

    private BeanOne beanOne;

    @Required
    public void setBeanOne(BeanOne beanOne){
        this.beanOne = beanOne;
    }

    public void doSomeThing(){
        System.out.println("Inside do something( method of BeanOne)");;
        beanOne.doSomeThing();
    }
}
