package com.example.be.service.product.impl;

import com.example.be.model.product.StorageCapacity;
import com.example.be.repository.product.IStorageCapacityRepository;
import com.example.be.service.product.IStorageCapacityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorageCapacityService implements IStorageCapacityService {
    @Autowired
    IStorageCapacityRepository storageCapacityRepository;

    @Override
    public List<StorageCapacity> getStorageList() {
        return storageCapacityRepository.findAll();
    }

    @Override
    public List<StorageCapacity> getStorageListByProductId(Integer id) {
        return storageCapacityRepository.getStorageListByProductId(id);
    }
}
