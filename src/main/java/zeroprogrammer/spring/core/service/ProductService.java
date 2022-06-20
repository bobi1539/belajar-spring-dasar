package zeroprogrammer.spring.core.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import zeroprogrammer.spring.core.repository.ProductRepository;

//@Lazy
//@Scope("prototype")
@Component
public class ProductService {

    @Getter
    private ProductRepository productRepository;

    @Autowired
    public ProductService (ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public ProductService (ProductRepository productRepository, String name){
        this.productRepository = productRepository;
    }
}
