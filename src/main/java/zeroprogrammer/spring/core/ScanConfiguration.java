package zeroprogrammer.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "zeroprogrammer.spring.core.configuration"
})
public class ScanConfiguration {
}
