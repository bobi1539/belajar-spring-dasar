package zeroprogrammer.spring.core.application;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import zeroprogrammer.spring.core.data.Bar;
import zeroprogrammer.spring.core.data.Foo;
import zeroprogrammer.spring.core.listener.AppStartingListener;

import java.util.List;

@SpringBootApplication
public class FooApplication {

//    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(FooApplication.class, args);
//        Foo foo = context.getBean(Foo.class);
//        System.out.println(foo);
//    }

//    public static void main(String[] args) {
//        SpringApplication application = new SpringApplication(FooApplication.class);
//        application.setBannerMode(Banner.Mode.OFF);
//        //application.setListeners(List.of(new AppStartingListener()));
//
//        ConfigurableApplicationContext context = application.run(args);
//
//        Foo foo = context.getBean(Foo.class);
//        System.out.println(foo);
//    }

    @Bean
    public Foo foo(){
        return new Foo();
    }

}
