package com.ecommorce.ecommerce.services;

import com.ecommorce.ecommerce.models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> findAll();
    Optional<Product> findOneById(String id);
    Product save(Product product);
    Product update(Product product);
    void delete(String id);

}
