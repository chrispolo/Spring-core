package springframework.di.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import springframework.di.service.MessageService;

/**
 * @Author: guohongwu
 * @Date: 2021/3/27 上午10:15
 */
@Component
public class FieldBasedInjection {

    @Autowired
    @Qualifier("TwitterService")
    private MessageService messageService;

    public void processMsg(String message) {
        messageService.sendMsg(message);
    }
}
