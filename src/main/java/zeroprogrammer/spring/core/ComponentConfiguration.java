package zeroprogrammer.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import zeroprogrammer.spring.core.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
        "zeroprogrammer.spring.core.service",
        "zeroprogrammer.spring.core.repository",
        "zeroprogrammer.spring.core.configuration",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
