package com.ecommorce.ecommerce.repositories;

import com.ecommorce.ecommerce.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "users", collectionResourceRel = "users", exported = false)
public interface UserRepository extends JpaRepository<User, String> {
}

