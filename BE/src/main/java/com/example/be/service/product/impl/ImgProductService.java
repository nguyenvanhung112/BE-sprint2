package com.example.be.service.product.impl;

import com.example.be.model.product.ImgUrlProduct;
import com.example.be.repository.product.IImgUrlProductRepository;
import com.example.be.service.product.IImgUrlProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImgProductService implements IImgUrlProductService {
    @Autowired
    private IImgUrlProductRepository iImgUrlProductRepository;

    @Override
    public List<ImgUrlProduct> getListImgProduct(Integer id) {
        return iImgUrlProductRepository.getListImgProduct(id);
    }
}
