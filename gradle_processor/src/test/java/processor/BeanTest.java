package processor;

import javax.ejb.embeddable.EJBContainer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BeanTest {
    EJBContainer container;
    
//    @EJB
//    private SubscriberFactory sub;
    
    @BeforeEach
    public void startContainer() throws Exception {
        System.out.println("starting the container");
        try {
        container = EJBContainer.createEJBContainer();
        container.getContext().bind("inject", this);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("patrick");
    }
    
    @Test
    public void test() {
        System.out.println("container successfully created");
    }
    
    @AfterEach
    public void closeContainer() throws Exception {
        container.close();
    }

}
