package com.noxus.draven.security.service;

import com.noxus.draven.security.pojo.Product;

import java.util.List;

public interface ProductService {

    public List<Product> findAll() throws Exception;

    void save(Product product) throws Exception;
}
