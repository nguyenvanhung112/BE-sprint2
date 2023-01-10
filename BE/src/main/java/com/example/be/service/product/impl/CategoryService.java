package com.example.be.service.product.impl;

import com.example.be.model.product.Category;
import com.example.be.repository.product.ICategoryRepository;
import com.example.be.service.product.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public List<Category> getListCategory() {
        return categoryRepository.findAll();
    }
}
