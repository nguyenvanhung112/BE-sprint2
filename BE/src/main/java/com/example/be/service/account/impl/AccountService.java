package com.example.be.service.account.impl;

import com.example.be.repository.account.IAccountRepository;
import com.example.be.service.account.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements IAccountService {
    @Autowired
    private IAccountRepository accountRepository;
}
