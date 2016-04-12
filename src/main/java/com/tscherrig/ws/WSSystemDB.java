package com.tscherrig.ws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/db")
public class WSSystemDB {
	
	
	@GET
	@Path("/")
	public Response list() {
		String content = "";
		return Response.status(200).entity(content).build();
	}
	
	@GET
	@Path("/{id}")
	public Response get(@PathParam("id") int id) {
		
		return Response.status(404).build();
	}
	
}
