package springframework.di.service;

import org.springframework.stereotype.Service;

/**
 * @Author: guohongwu
 * @Date: 2021/3/27 上午9:55
 */
@Service("EmailService")
public class EmailService implements MessageService {

    public void sendMsg(String message) {
        System.out.println(message);
    }
}
