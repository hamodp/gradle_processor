package processor;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.ejb.Stateless;
import javax.inject.Inject;

import processor.subscribers.OdometrySubscriber;

@Stateless
public class SubscriberFactory {

    @Inject
    private OdometrySubscriber odometry;
    
    private Map<String, SubscriberInterface> subscribers = new HashMap<String, SubscriberInterface>();

    public SubscriberFactory() {

        System.out.println("creating subscriberfactory");
//        try {
//            Enumeration<URL> test = ClassLoader.getSystemResources("");
//            while (test.hasMoreElements()) {
//                System.out.println("class path: " + test.nextElement().toString());
//
//            }
//            
//            register(odometry);
//
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }

    }

    public void register(SubscriberInterface sub) {
        subscribers.put(sub.getName(), sub);
        System.out.println("subscribing");

    }
    
}
