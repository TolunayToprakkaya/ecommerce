package com.ecommorce.ecommerce.services.impl;

import com.ecommorce.ecommerce.models.Product;
import com.ecommorce.ecommerce.repositories.ProductRepository;
import com.ecommorce.ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public Optional<Product> findOneById(String id) {
        return this.productRepository.findById(id);
    }

    @Transactional
    @Override
    public Product save(Product product) {
        return this.productRepository.save(product);
    }

    @Transactional
    @Override
    public Product update(Product product) {
        return this.productRepository.save(product);
    }

    @Transactional
    @Override
    public void delete(String id) {
        this.productRepository.deleteById(id);
    }

}
