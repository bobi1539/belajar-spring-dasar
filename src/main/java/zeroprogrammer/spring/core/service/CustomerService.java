package zeroprogrammer.spring.core.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import zeroprogrammer.spring.core.repository.CustomerRepository;

@Component
public class CustomerService {

    @Getter
    @Autowired // tidak direkomendasikan
    private CustomerRepository customerRepository;
}
