package com.example.be.repository.product;

import com.example.be.model.product.StorageCapacity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface IStorageCapacityRepository extends JpaRepository<StorageCapacity, Integer> {

    @Query(value = "select storage_capacity.id,storage_capacity.name  from storage_capacity \n" +
            "join product_detail on storage_capacity.id = product_detail.storage_capacity_id where product_detail.product_id = :id group by  storage_capacity.id order by storage_capacity.id",nativeQuery = true)
    List<StorageCapacity> getStorageListByProductId(@Param("id") Integer id);
}
