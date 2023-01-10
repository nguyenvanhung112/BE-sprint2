package com.example.be.service.user.impl;

import com.example.be.repository.user.IAddressRepository;
import com.example.be.service.user.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService implements IAddressService {
    @Autowired
    private IAddressRepository addressRepository;
}
