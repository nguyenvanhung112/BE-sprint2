package com.example.be.service.product;

import com.example.be.model.product.StorageCapacity;

import java.util.List;

public interface IStorageCapacityService {
    List<StorageCapacity> getStorageList();

    List<StorageCapacity> getStorageListByProductId(Integer id);
}
