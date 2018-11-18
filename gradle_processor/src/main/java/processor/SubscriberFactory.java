package processor;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class SubscriberFactory {
	
	private static Map<String, SubscriberInterface> subscribers = new HashMap<String, SubscriberInterface>();
	
	public SubscriberFactory() {
		
		
		try {
			Enumeration<URL> test = ClassLoader.getSystemResources("");
			while(test.hasMoreElements()) {
				System.out.println("class path: " +  test.nextElement().toString());
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void register(SubscriberInterface sub) {
		subscribers.put(sub.getName(), sub);
		
	}

}
