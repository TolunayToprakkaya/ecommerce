package com.ecommorce.ecommerce.controllers;

import com.ecommorce.ecommerce.models.Favorite;
import com.ecommorce.ecommerce.services.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/favorites")
public class FavoriteController {

    @Autowired
    @Qualifier("favoriteService")
    private FavoriteService favoriteService;

    //FindAll
    @RequestMapping(method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Favorite> findAll() {
        return favoriteService.findAll();
    }

    //Save
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "http://localhost:3000")
    public void save(@RequestBody Favorite favorite) {
        favoriteService.save(favorite);
    }

    //Update
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @CrossOrigin(origins = "http://localhost:3000")
    public void update(@RequestBody Favorite favorite){
        favoriteService.update(favorite);
    }

    //Delete
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @CrossOrigin(origins = "http://localhost:3000")
    public void delete(@PathVariable String id){
        favoriteService.delete(id);
    }


}
