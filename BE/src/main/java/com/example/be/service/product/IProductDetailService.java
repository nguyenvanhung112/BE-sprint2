package com.example.be.service.product;

import com.example.be.dto.IProductDtoDisplay;
import com.example.be.model.product.ProductDetail;
import com.example.be.payload.request.FormSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductDetailService {
    List<IProductDtoDisplay> getListProductDisplayHome();

    List<ProductDetail> getListProductDetailByProductId(Integer productId);

    ProductDetail getProductDetail(Integer id, String storage, String color);

    List<IProductDtoDisplay> getListProductDetailByCategory(String category);

    List<IProductDtoDisplay> searchProductByName(String nameProduct);


    Page<IProductDtoDisplay> searchProductByCategoryAndPriceAndName(FormSearch formSearch, Pageable pageable);
}
