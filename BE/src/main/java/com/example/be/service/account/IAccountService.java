package com.example.be.service.account;

import com.example.be.model.account.Account;

public interface IAccountService {
    Account findAccountByUsername(String username);
}
