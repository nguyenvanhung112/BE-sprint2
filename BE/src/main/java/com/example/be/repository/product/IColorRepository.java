package com.example.be.repository.product;

import com.example.be.model.product.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface IColorRepository extends JpaRepository<Color, Integer> {
    @Query(value = "select color.id,color.name  from color join product_detail on color.id = product_detail.color_id join storage_capacity on product_detail.storage_capacity_id = storage_capacity.id where product_detail.product_id = :id and storage_capacity.name = :storage group by  color.id order by color.id",nativeQuery = true)
    List<Color> getColorListByProductId(@Param("id") Integer id,
                                        @Param("storage") String storage);
}
