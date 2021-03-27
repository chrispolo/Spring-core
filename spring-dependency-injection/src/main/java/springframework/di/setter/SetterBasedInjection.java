package springframework.di.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import springframework.di.service.MessageService;

/**
 * @Author: guohongwu
 * @Date: 2021/3/27 上午10:51
 */
@Component
public class SetterBasedInjection {

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
