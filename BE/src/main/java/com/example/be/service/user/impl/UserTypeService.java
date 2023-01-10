package com.example.be.service.user.impl;

import com.example.be.repository.user.IUserTypeRepository;
import com.example.be.service.user.IUserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserTypeService implements IUserTypeService {
    @Autowired
    private IUserTypeRepository userTypeRepository;
}
