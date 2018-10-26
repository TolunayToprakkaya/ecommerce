package com.ecommorce.ecommerce.services;

import com.ecommorce.ecommerce.models.Favorite;

import java.util.List;
import java.util.Optional;

public interface FavoriteService {

    List<Favorite> findAll();
    Optional<Favorite> findOneById(String id);
    Favorite save(Favorite favorite);
    Favorite update(Favorite favorite);
    void delete(String id);

}
