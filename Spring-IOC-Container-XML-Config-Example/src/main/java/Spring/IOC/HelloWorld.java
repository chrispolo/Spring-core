package Spring.IOC;

/**
 * 配置HelloWorld Spring Beans
 * @Author: guohongwu
 * @Date: 2021/3/25 下午10:02
 */
public class HelloWorld {

    private String message;

    public void setMessage(String message){
        this.message = message;
    }

    public void getMessage(){
        System.out.println("My message:"+message);
    }
}
