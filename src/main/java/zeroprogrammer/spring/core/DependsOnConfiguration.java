package zeroprogrammer.spring.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import zeroprogrammer.spring.core.data.Bar;
import zeroprogrammer.spring.core.data.Foo;

@Configuration
@Slf4j
public class DependsOnConfiguration {

    @Bean
    @DependsOn({
            "bar"
    })
    @Lazy
    public Foo foo(){
      log.info("Create new foo");
      return new Foo();
    }

    @Bean
    public Bar bar(){
        log.info("Create new bar");
        return new Bar();
    }

}
