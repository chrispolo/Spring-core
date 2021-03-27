package springframework.di.service;

/**
 * @Author: guohongwu
 * @Date: 2021/3/27 上午9:56
 */
public class SMSService implements MessageService{

    public void sendMsg(String message) {
        System.out.println(message);
    }
}
