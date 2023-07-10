package bug.resteasy.reactive;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/hello")
public class GreetingResource implements Greetings {

    @GET
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

}
