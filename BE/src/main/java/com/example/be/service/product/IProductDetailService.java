package com.example.be.service.product;

import com.example.be.dto.IProductDtoDisplay;
import com.example.be.model.product.ProductDetail;

import java.util.List;

public interface IProductDetailService {
    List<IProductDtoDisplay> getListProductDisplayHome();

    List<ProductDetail> getListProductDetailByProductId(Integer productId);

    ProductDetail getProductDetail(Integer id, String storage, String color);

    List<IProductDtoDisplay> getListProductDetailByCategory(String category);

    List<IProductDtoDisplay> searchProductByName(String nameProduct);
}
