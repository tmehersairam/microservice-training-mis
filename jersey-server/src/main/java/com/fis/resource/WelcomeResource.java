package com.fis.resource;

import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


public class WelcomeResource {


    @Path("/")
    public Response hello()
    {
       return Response.status(Response.Status.ACCEPTED).entity("Hello From Jersey application").build();
    }
}
