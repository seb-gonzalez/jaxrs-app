package com.sebastian.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class CommentResource {

	@GET	
	public String test() {
		return "subresource!!!!";
	}
	
	@GET
	@Path("/{veamos}")
	public String test2(@PathParam("veamos") long veamos){
		return "Veamos " + veamos;
	}
}
