package processor;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SubscriberFactoryTest {
	
	@Test
	public void testShouldRunTheSubscriberFactoryConstructor() {
		new SubscriberFactory();
		System.out.println("testing " + SubscriberFactory.class.getResource("subscribers/OdometrySubscriber.class"));
		
		try {
			Enumeration<URL> test = ClassLoader.getSystemResources("");
			List<File> fileArray = new ArrayList<File>();
//			while(test.hasMoreElements()) {
//				File dir = new File(test.nextElement().getFile());
//				if(dir.isFile()) {
//					fileArray.add(dir);
//				}
//
//				File[] files = dir.listFiles();
//				while(files != null) {
//					for(int i=0; i<files.length; i++) {
//						fileArray.add(files[i]);
//					}
//					
//				}
				
				

				
//			}
//			
//			for(File file: fileArray) {
//				System.out.println();
//			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
