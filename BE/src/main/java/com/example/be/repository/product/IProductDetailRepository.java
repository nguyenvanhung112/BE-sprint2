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
    /**
     * Hiển thị danh sách sản phẩm trên trang chủ
     */
    @Query(value = "select productdisplay.id,min(productdisplay.price) as price,productdisplay.name,productdisplay.category, group_concat(img_url_product.url) as urls from productdisplay " +
            "join img_url_product on img_url_product.product_id = productdisplay.id group by productdisplay.id order by productdisplay.release_date desc", nativeQuery = true)
    List<IProductDtoDisplay> getProductDisplayHome();

    @Query(value = "select * from product_detail where product_id = :id order by product_detail.price", nativeQuery = true)
    List<ProductDetail> getProductDetailByProductId(@Param("id") Integer productId);

    /**
     * Tìm kiếm sản phẩm chi tiết theo id sản phẩm, dung lượng,màu sắc
     */
    @Query(value = "select product_detail.*   from product_detail \n" +
            "join color on color.id = product_detail.color_id\n" +
            "join storage_capacity on product_detail.storage_capacity_id = storage_capacity.id\n" +
            "where product_detail.product_id = :id and storage_capacity.name = :storage and color.name = :color ",nativeQuery = true)
    ProductDetail getProductDetail(@Param("id") Integer id,@Param("storage") String storage,@Param("color") String color);

    @Query(value = "select productdisplay.id,min(productdisplay.price) as price,productdisplay.name,productdisplay.category, group_concat(img_url_product.url) as urls from productdisplay " +
            "join img_url_product on img_url_product.product_id = productdisplay.id where productdisplay.category = :category group by productdisplay.id order by productdisplay.release_date desc", nativeQuery = true)
    List<IProductDtoDisplay> getListProductDetailByCategory(@Param("category") String category);
    @Query(value = "select productdisplay.id,min(productdisplay.price) as price,productdisplay.name,productdisplay.category, group_concat(img_url_product.url) as urls from productdisplay " +
            "join img_url_product on img_url_product.product_id = productdisplay.id where productdisplay.name like %:nameProduct% group by productdisplay.id order by productdisplay.release_date desc", nativeQuery = true)
    List<IProductDtoDisplay> searchProductByName(@Param("nameProduct") String nameProduct);
}
