package com.example.be.service.product.impl;

import com.example.be.dto.IProductDtoDisplay;
import com.example.be.model.product.ProductDetail;
import com.example.be.repository.product.IProductDetailRepository;
import com.example.be.service.product.IProductDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDetailService implements IProductDetailService {
    @Autowired
    private IProductDetailRepository productDetailRepository;

    @Override
    public List<IProductDtoDisplay> getListProductDisplayHome() {
        return productDetailRepository.getProductDisplayHome();
    }

    @Override
    public List<ProductDetail> getListProductDetailByProductId(Integer productId) {
        return productDetailRepository.getProductDetailByProductId(productId);
    }

    @Override
    public ProductDetail getProductDetail(Integer id, String storage, String color) {
        return productDetailRepository.getProductDetail(id, storage, color);
    }

    @Override
    public List<IProductDtoDisplay> getListProductDetailByCategory(String category) {
        return productDetailRepository.getListProductDetailByCategory(category);
    }

    @Override
    public List<IProductDtoDisplay> searchProductByName(String nameProduct) {
        return productDetailRepository.searchProductByName(nameProduct);
    }
}
