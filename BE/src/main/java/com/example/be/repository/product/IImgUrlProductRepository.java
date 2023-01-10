package com.example.be.repository.product;

import com.example.be.model.product.ImgUrlProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface IImgUrlProductRepository extends JpaRepository<ImgUrlProduct, Integer> {
    @Query(value = "select * from img_url_product where product_id = :id", nativeQuery = true)
    List<ImgUrlProduct> getListImgProduct(@Param("id") Integer id);
}
