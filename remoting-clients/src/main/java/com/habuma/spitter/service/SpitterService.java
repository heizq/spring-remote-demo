package com.habuma.spitter.service;

/**
 * Created by heizhiqiang on 2015/11/3 0003.
 */
import java.util.List;

import com.habuma.spitter.domain.Spitter;
import com.habuma.spitter.domain.Spittle;

public interface SpitterService {

    List<Spittle> getRecentSpittles(int count);

    List<Spittle> getSpittlesForSpitter(Spitter spitter);

    List<Spittle> getSpittlesForSpitter(String username);

    Spitter getSpitter(String username);

    Spittle getSpittleById(long id);


    List<Spitter> getAllSpitters();
}