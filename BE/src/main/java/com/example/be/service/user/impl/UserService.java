package com.example.be.service.user.impl;

import com.example.be.repository.user.IUserRepository;
import com.example.be.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;
}
