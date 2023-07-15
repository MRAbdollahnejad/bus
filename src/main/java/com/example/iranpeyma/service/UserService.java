package com.example.iranpeyma.service;

import com.example.iranpeyma.base.service.BaseService;
import com.example.iranpeyma.dto.LoginDto;
import com.example.iranpeyma.entity.Users;

import java.util.Optional;

public interface UserService extends BaseService<Users,Long> {
    Optional<Users> findUserByUsernameAndPassword(String username, byte[] password);
    boolean isUserExist(LoginDto loginDto);
}
