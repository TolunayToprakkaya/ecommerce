package com.ecommorce.ecommerce.services;

import com.ecommorce.ecommerce.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();
    Optional<User> findOneById(String id);
    User save(User user);
    User update(User user);
    void delete(String id);

}
