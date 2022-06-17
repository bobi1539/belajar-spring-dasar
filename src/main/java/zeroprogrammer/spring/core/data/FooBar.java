package zeroprogrammer.spring.core.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor // membuat semua constructor otomatis
@Data // membuat getter setter otomatis
public class FooBar {

    private Foo foo;
    private Bar bar;
}
