package com.habuma.spitter.client.rmi;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.habuma.spitter.domain.Spitter;
import com.habuma.spitter.domain.Spittle;
import com.habuma.spitter.service.SpitterService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpitterRmiClient {

  @Autowired
  SpitterService spitterService;

  public List<Spittle> getSpittles(String userName) {
    Spitter spitter = spitterService.getSpitter(userName);
    return spitterService.getSpittlesForSpitter(spitter);
  }

  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("rmi-client-context.xml");
    SpitterService service = (SpitterService) ctx.getBean("spitterService");
    Spitter spitter = service.getSpitter("frank");
    System.out.println(spitter.getFullName());
  }


}
