package com.klima.tomas.persistence.dao;


import com.klima.tomas.persistence.entity.Beer;

import java.util.List;

public interface BeerDao {
    void create(Beer beer);

    List<Beer> getAll();
}
