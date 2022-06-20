package zeroprogrammer.spring.core.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import zeroprogrammer.spring.core.event.LoginSuccessEvent;

@Component
@Slf4j
public class UserListener {

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent(LoginSuccessEvent loginSuccessEvent){
        log.info("login success for user {}", loginSuccessEvent.getUser());
    }

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent2(LoginSuccessEvent loginSuccessEvent){
        log.info("login success for user {}", loginSuccessEvent.getUser());
    }

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent3(LoginSuccessEvent loginSuccessEvent){
        log.info("login success for user {}", loginSuccessEvent.getUser());
    }
}
