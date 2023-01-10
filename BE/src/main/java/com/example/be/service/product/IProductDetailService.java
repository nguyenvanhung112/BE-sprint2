package com.example.be.service.product;

import com.example.be.dto.IProductDtoDisplay;
import com.example.be.model.product.ProductDetail;

import java.util.List;

public interface IProductDetailService {
    List<IProductDtoDisplay> getListProductDisplayHome();

    List<ProductDetail> getListProductDetailByProductId(Integer productId);
}
