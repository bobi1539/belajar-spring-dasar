package zeroprogrammer.spring.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import zeroprogrammer.spring.core.listener.LoginAgainSuccessListener;
import zeroprogrammer.spring.core.listener.LoginSuccessListener;
import zeroprogrammer.spring.core.service.UserService;

public class EventListenerTest {

    @Configuration
    @Import({
            LoginSuccessListener.class,
            LoginAgainSuccessListener.class,
            UserService.class
    })
    public static class TestConfiguration{

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testEvent() {
        UserService userService = applicationContext.getBean(UserService.class);
        userService.login("ucup", "ucup");
        userService.login("ucup", "salah");
        userService.login("tono", "salah");


    }
}
