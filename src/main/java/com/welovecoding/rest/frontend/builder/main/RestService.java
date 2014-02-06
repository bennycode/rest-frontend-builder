package com.welovecoding.rest.frontend.builder.main;

import com.welovecoding.rest.frontend.builder.domain.Person;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/service")
@Stateless
public class RestService {

  public RestService() {
  }

  @PostConstruct
  private void init() {
  }

  @GET
  @Path("person")
  @Produces(MediaType.APPLICATION_JSON)
  public Person getPerson(int id) {
    return new Person("Benny", "Neugebauer", 26);
  }

  @GET
  @Path("people")
  @Produces(MediaType.APPLICATION_JSON)
  public List<Person> getPeople() {
    List<Person> list = new ArrayList<>();

    list.add(new Person("Benny", "Neugebauer", 26));
    list.add(new Person("Helena", "Minutsch", 23));
    list.add(new Person("Jack", "Jacobson", 28));
    list.add(new Person("Ruth", "Bauer", 45));

    return list;
  }
}
