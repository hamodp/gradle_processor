package processor.subscribers;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import processor.SubscriberFactory;


@Path("/rest")
public class Hello {

    @EJB
    SubscriberFactory sub;
	
  @GET
  @Path("/hello")
  public String helloworld() {
      System.out.println("patrick");
      return "Hello World!";
  }
  
}
 