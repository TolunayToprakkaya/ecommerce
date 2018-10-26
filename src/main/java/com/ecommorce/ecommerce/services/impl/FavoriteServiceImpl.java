package com.ecommorce.ecommerce.services.impl;

import com.ecommorce.ecommerce.models.Favorite;
import com.ecommorce.ecommerce.repositories.FavoriteRepository;
import com.ecommorce.ecommerce.services.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service("favoriteService")
public class FavoriteServiceImpl implements FavoriteService {

    @Autowired
    private FavoriteRepository favoriteRepository;

    @Override
    public List<Favorite> findAll() {
        return this.favoriteRepository.findAll();
    }

    @Override
    public Optional<Favorite> findOneById(String id) {
        return this.favoriteRepository.findById(id);
    }

    @Transactional
    @Override
    public Favorite save(Favorite favorite) {
        return this.favoriteRepository.save(favorite);
    }

    @Transactional
    @Override
    public Favorite update(Favorite favorite) {
        return this.favoriteRepository.save(favorite);
    }

    @Transactional
    @Override
    public void delete(String id) {
        this.favoriteRepository.deleteById(id);
    }

}
