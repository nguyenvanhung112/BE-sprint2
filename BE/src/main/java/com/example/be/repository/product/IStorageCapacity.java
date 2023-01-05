package com.example.be.repository.product;

import com.example.be.model.product.StorageCapacity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IStorageCapacity extends JpaRepository<StorageCapacity, Integer> {
}
