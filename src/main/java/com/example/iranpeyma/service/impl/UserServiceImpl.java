package com.example.iranpeyma.service.impl;

import com.example.iranpeyma.base.service.BaseServiceImpl;
import com.example.iranpeyma.entity.User;
import com.example.iranpeyma.repository.UserRepository;
import com.example.iranpeyma.service.UserService;

public class UserServiceImpl extends BaseServiceImpl<User,Long, UserRepository> implements UserService {
    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }
}
