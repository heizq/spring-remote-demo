package com.hei.remote.service;

/**
 * Created by heizhiqiang on 2015/11/3 0003.
 */

import com.hei.remote.domain.Spitter;
import com.hei.remote.domain.Spittle;

import java.util.List;

public interface SpitterService {
    List<Spittle> getRecentSpittles(int count);

    List<Spittle> getSpittlesForSpitter(Spitter spitter);

    List<Spittle> getSpittlesForSpitter(String username);

    Spitter getSpitter(String username);

    Spittle getSpittleById(long id);


    List<Spitter> getAllSpitters();
}