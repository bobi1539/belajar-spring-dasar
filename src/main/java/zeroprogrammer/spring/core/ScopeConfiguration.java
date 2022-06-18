package zeroprogrammer.spring.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import zeroprogrammer.spring.core.data.Bar;
import zeroprogrammer.spring.core.data.Foo;
import zeroprogrammer.spring.core.scope.DoubletonScope;

@Slf4j
@Configuration
public class ScopeConfiguration {

    @Bean
    @Scope("prototype") // membuat object setiap dipanggil
    public Foo foo(){
        log.info("Create new foo");
        return new Foo();
    }

    @Bean
    public CustomScopeConfigurer customScopeConfigurer(){
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubletonScope());
        return configurer;
    }

    @Bean
    @Scope("doubleton")
    public Bar bar(){
        log.info("create new bar");
        return new Bar();
    }
}
