package com.klima.tomas.controller;

import com.klima.tomas.persistence.dao.BeerDao;
import com.klima.tomas.persistence.dao.BeerDaoImpl;
import com.klima.tomas.persistence.entity.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private BeerDao beerDao;


    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        Beer beer = new Beer();
        beer.setName("Plzen");
        beerDao.create(beer);

        List<Beer> all = beerDao.getAll();


        model.addAttribute("allbeers", all);
        model.addAttribute("Title", "HELLO SPRING MVC");
        return "hello";
    }


}
