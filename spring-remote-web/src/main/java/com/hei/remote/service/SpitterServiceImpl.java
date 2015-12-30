package com.hei.remote.service;

import com.hei.remote.domain.Spitter;
import com.hei.remote.domain.Spittle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.lang.Math.min;
import static java.util.Collections.reverse;

public class SpitterServiceImpl implements SpitterService {



  public List<Spittle> getRecentSpittles(int count) {
    List<Spittle> recentSpittles = new ArrayList<Spittle>();

    reverse(recentSpittles);

    return recentSpittles.subList(0, 
            min(49, recentSpittles.size()));
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


  
  public List<Spitter> getAllSpitters() {
    List<Spitter> list = new ArrayList<Spitter>();
    return list;
  }


  public Spittle getSpittleById(long id) {
    return new Spittle();
  }
}
