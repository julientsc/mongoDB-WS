package com.tscherrig.ws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/db")
public class WSSystemDB {
	
	@GET
	@Path("/{db}/")
	public Response list() {
		String content = "";
		return Response.status(200).entity(content).build();
	}
	
	@GET
	@Path("/{db}/{id}")
	public Response detail(@PathParam("id") int id) {
		return Response.status(404).build();
	}
	
	@POST
	@Path("/{db}/")
	public Response list() {
		String content = "";
		return Response.status(200).entity(content).build();
	}
	
}
