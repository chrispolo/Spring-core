package springframework.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @Author: guohongwu
 * @Date: 2021/3/27 上午9:58
 */
public class UserServiceImpl implements UserService {

    private MessageService messageService;

    @Autowired
    @Qualifier("TwitterService")
    public void setMessageService(MessageService messageService){
        this.messageService = messageService;
    }

    public void processMsg(String message){
        messageService.sendMsg(message);
    }
}
