package com.example.be.service.product.impl;

import com.example.be.dto.IProductDtoDisplay;
import com.example.be.model.product.ProductDetail;
import com.example.be.payload.request.FormSearch;
import com.example.be.repository.product.IProductDetailRepository;
import com.example.be.service.product.IProductDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    @Override
    public Page<IProductDtoDisplay> searchProductByCategoryAndPriceAndName(FormSearch formSearch, Pageable pageable) {
        String price[] = formSearch.getPrice().split(",");
        String firstPrice = price[0];
        String secondPrice = price[1];
        return productDetailRepository.searchProductByCategoryAndPriceAndName(formSearch.getName(),formSearch.getCategory(),firstPrice,secondPrice, pageable);
    }

    @Override
    public ProductDetail getProductDetailById(Integer productDetailId) {
        return productDetailRepository.findById(productDetailId).orElse(null);
    }

//    @Override
//    public Page<IProductDtoDisplay> searchProductByCategoryAndPriceAndName(FormSearch formSearch, org.springframework.data.domain.Pageable pageable) {
//        String price[] = formSearch.getPrice().split(",");
//        String firstPrice = price[0];
//        String secondPrice = price[1];
//        return productDetailRepository.searchProductByCategoryAndPriceAndName(formSearch.getName(),formSearch.getCategory(),firstPrice,secondPrice, pageable);
//    }


}
