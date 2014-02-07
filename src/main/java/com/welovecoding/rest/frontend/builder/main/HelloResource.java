package com.welovecoding.rest.frontend.builder.main;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * http://www.ibm.com/developerworks/library/wa-aj-tomcat/
 * https://jersey.java.net/documentation/latest/deployment.html#deployment.servlet.2
 * http://www.vogella.com/tutorials/REST/article.html
 * 
 * @author Benny
 */
@Path("/hello")
public class HelloResource {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String sayHello() {
    return "Hello Jersey";
  }
}
