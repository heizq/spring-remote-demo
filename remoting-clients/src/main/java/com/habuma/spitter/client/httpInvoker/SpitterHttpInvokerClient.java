package com.habuma.spitter.client.httpInvoker;

import com.habuma.spitter.domain.Spitter;
import com.habuma.spitter.service.SpitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by heizhiqiang on 2015/11/4 0004.
 */
public class SpitterHttpInvokerClient {

    @Autowired
    SpitterService spitterService;


    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("httpInvoker-client-context.xml");
        SpitterService service = (SpitterService) ctx.getBean("spitterService");
        Spitter spitter = service.getSpitter("frank");
        System.out.println(spitter.getFullName());
        System.out.println("test ................");
    }
}
