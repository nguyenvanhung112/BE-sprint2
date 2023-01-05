package com.example.be.service.account.impl;

import com.example.be.repository.account.IRoleRepository;
import com.example.be.service.account.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService implements IRoleService {
    @Autowired
    private IRoleRepository roleRepository;
}
