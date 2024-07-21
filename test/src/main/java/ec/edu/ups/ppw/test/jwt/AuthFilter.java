package ec.edu.ups.ppw.test.jwt;

import java.io.IOException;

import jakarta.annotation.Priority;
import jakarta.ws.rs.Priorities;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerRequestFilter;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.container.ContainerResponseFilter;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.SecurityContext;
import jakarta.ws.rs.ext.Provider;

@Provider
@Priority(Priorities.AUTHENTICATION)
public class AuthFilter implements ContainerRequestFilter, ContainerResponseFilter{
	
	// Para resolver los problemas de CORS
	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {
		// TODO Auto-generated method stub
		responseContext.getHeaders().putSingle("Access-Control-Allow-Origin", "*");
		responseContext.getHeaders().putSingle("Access-Control-Allow-Methods", 
	            						"GET, POST, PUT, DELETE, OPTIONS");
		responseContext.getHeaders().putSingle("Access-Control-Allow-Headers",
		           			"content-type, Authorization");
	}
	
	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		// TODO Auto-generated method stub)
		SecurityContext context = requestContext.getSecurityContext();
		String authHeader = requestContext.getHeaderString(HttpHeaders.AUTHORIZATION);
		String v = "sd";
 	}

}
