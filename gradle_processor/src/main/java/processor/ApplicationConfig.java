package processor;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

import processor.subscribers.Hello;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/resources")
public class ApplicationConfig extends Application {
	
    @Override
    public Set<Class<?>> getClasses()
    {
        Set<Class<?>> Resources = new HashSet<Class<?>>();
        Resources.add(Hello.class);
//        Resources.add(LivenessCheck.class);
        return Resources;
    }
}