package com.example.iranpeyma.service;

import com.example.iranpeyma.base.service.BaseService;
import com.example.iranpeyma.entity.Users;

public interface UserService extends BaseService<Users,Long> {
    Users findUserByUsernameAndPassword(String username,String password);
    boolean isUserExist();
}
