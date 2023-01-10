package com.example.be.service.product.impl;

import com.example.be.model.product.Product;
import com.example.be.repository.product.IProductRepository;
import com.example.be.service.product.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public Product getProductById(Integer id) {
        return productRepository.findById(id).orElse(null);
    }
}
