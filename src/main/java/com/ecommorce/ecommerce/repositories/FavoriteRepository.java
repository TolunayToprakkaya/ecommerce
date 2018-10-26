package com.ecommorce.ecommerce.repositories;

import com.ecommorce.ecommerce.models.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "favorites", collectionResourceRel = "favorites", exported = false)
public interface FavoriteRepository extends JpaRepository<Favorite, String> {
}
