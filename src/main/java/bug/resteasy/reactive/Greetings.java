package bug.resteasy.reactive;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;

public interface Greetings {

    @GET
    @Path("/version/{id}")
    default Response version(@PathParam("id") String id) {
        return Response.status(Response.Status.OK).build();
    }
}
