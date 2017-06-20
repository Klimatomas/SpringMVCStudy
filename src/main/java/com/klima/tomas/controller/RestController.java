package com.klima.tomas.controller;

import com.google.gson.Gson;
import com.klima.tomas.persistence.dao.BeerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    private final BeerDao beerDao;
    private Gson gson = new Gson();

    @Autowired
    public RestController(BeerDao beerDao) {
        this.beerDao = beerDao;
    }


    @RequestMapping("/hellobeer")
    public String beerList() {
        return gson.toJson(beerDao.getAll());
    }
}
