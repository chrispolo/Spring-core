package springframework.di.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import springframework.di.service.MessageService;

/**
 * @Author: guohongwu
 * @Date: 2021/3/27 上午9:51
 */
@Component
public class ConstructorBasedInjection {

    private MessageService messageService;

    @Autowired
    public ConstructorBasedInjection(@Qualifier("TwitterService")
                                             MessageService messageService) {
        super();
        this.messageService = messageService;
    }

    public void processMsg(String message) {
        messageService.sendMsg(message);
    }
}