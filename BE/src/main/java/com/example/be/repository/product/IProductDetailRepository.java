package com.example.be.repository.product;

import com.example.be.model.product.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IProductDetailRepository extends JpaRepository<ProductDetail, Integer> {
}
