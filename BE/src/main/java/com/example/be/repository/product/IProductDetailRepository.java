package com.example.be.repository.product;

import com.example.be.dto.IProductDtoDisplay;
import com.example.be.model.product.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface IProductDetailRepository extends JpaRepository<ProductDetail, Integer> {

    @Query(value = "select productdisplay.id,min(productdisplay.price) as price,productdisplay.name,productdisplay.category, group_concat(img_url_product.url) as urls from productdisplay " +
            "join img_url_product on img_url_product.product_id = productdisplay.id group by productdisplay.id", nativeQuery = true)
    List<IProductDtoDisplay> getProductDisplayHome();

    @Query(value = "select * from product_detail where product_id = :id", nativeQuery = true)
    List<ProductDetail> getProductDetailByProductId(@Param("id") Integer productId);
}
