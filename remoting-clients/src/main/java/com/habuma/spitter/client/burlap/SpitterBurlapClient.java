package com.habuma.spitter.client.burlap;

import com.habuma.spitter.domain.Spitter;
import com.habuma.spitter.service.SpitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by heizhiqiang on 2015/11/4 0004.
 */
public class SpitterBurlapClient {

    @Autowired
    SpitterService spitterService;


    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("burlap-client-context.xml");
        SpitterService service = (SpitterService) ctx.getBean("spitterService");
        Spitter spitter = service.getSpitter("frank");
        System.out.println(spitter.getFullName());
    }
}
