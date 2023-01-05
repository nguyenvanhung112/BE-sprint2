package com.example.be.service.account.impl;

import com.example.be.repository.account.IAccountRoleRepository;
import com.example.be.service.account.IAccountRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountRoleService implements IAccountRoleService {
    @Autowired
    private IAccountRoleRepository accountRoleRepository;
}
