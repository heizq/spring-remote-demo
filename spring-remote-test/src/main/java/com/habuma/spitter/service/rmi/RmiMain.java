package com.habuma.spitter.service.rmi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RmiMain {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("remote-service-context.xml");
    System.out.println("RMI服务伴随Spring的启动而启动了.....");

  }
}
