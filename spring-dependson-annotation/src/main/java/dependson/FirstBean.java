package dependson;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: guohongwu
 * @Date: 2021/3/27 上午11:40
 */
public class FirstBean {

    @Autowired
    private SecondBean secondBean;

    @Autowired
    private ThirdBean thirdBean;

    public FirstBean() {
        System.out.println("FirstBean Initialized via Constuctor");
    }

    public void populateBeans() {
        secondBean.display();
        thirdBean.display();
    }
}
