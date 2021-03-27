package dependson;

/**
 * @Author: guohongwu
 * @Date: 2021/3/27 上午11:41
 */
public class SecondBean {

    public SecondBean() {
        System.out.println("SecondBean Initialized via Constuctor");
    }

    public void display() {
        System.out.println("SecondBean method called");
    }
}
