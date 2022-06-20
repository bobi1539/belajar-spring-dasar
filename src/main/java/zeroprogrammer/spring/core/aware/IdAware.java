package zeroprogrammer.spring.core.aware;

import zeroprogrammer.spring.core.data.Foo;

public interface IdAware {

    void setId(String id);

    String getId();
}
