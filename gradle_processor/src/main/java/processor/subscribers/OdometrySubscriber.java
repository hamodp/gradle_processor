package processor.subscribers;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

import processor.SubscriberInterface;

@ApplicationScoped
public class OdometrySubscriber implements SubscriberInterface {

    @Override
    public String getName() {
        return "Odometry";
    }
    
    @PostConstruct
    public void init() {
        System.out.println("this is just a test" + getName());
    }

}
