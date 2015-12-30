package com.habuma.spitter.service.rmi;

import static java.lang.Math.*;
import static java.util.Collections.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.habuma.spitter.domain.Spitter;
import com.habuma.spitter.domain.Spittle;
import org.springframework.stereotype.Service;

public class SpitterServiceImpl implements SpitterService {

 /* @Autowired
  SpitterDao spitterDao;*/

  public void saveSpittle(Spittle spittle) {
    spittle.setWhen(new Date());
  }

  public List<Spittle> getRecentSpittles(int count) {
    List<Spittle> recentSpittles = new ArrayList<Spittle>();

    reverse(recentSpittles);

    return recentSpittles.subList(0, 
            min(49, recentSpittles.size()));
  }
  
  public void saveSpitter(Spitter spitter) {
  }
  
  public Spitter getSpitter(long id) {
    return new Spitter();
  }

  public void startFollowing(Spitter follower, Spitter followee) {
    // TODO Auto-generated method stub  
  }
  
  public List<Spittle> getSpittlesForSpitter(Spitter spitter) {
    List<Spittle> recentSpittles = new ArrayList<Spittle>();
    return recentSpittles;
  }

  public List<Spittle> getSpittlesForSpitter(String username) {
    Spitter spitter = new Spitter();
    return getSpittlesForSpitter(spitter);
  }

  public Spitter getSpitter(String username) {
    Spitter spitter = new Spitter();
    spitter.setFullName("hello ... "+username);
    return spitter;
  }

  public void deleteSpittle(long id) {

  }
  
  public List<Spitter> getAllSpitters() {
    List<Spitter> list = new ArrayList<Spitter>();
    return list;
  }



  public Spittle getSpittleById(long id) {
    return new Spittle();
  }
}
