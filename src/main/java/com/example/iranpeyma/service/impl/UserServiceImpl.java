package com.example.iranpeyma.service.impl;

import com.example.iranpeyma.base.service.BaseServiceImpl;
import com.example.iranpeyma.convertor.LoginDtoConvertorToUsers;
import com.example.iranpeyma.dto.LoginDto;
import com.example.iranpeyma.entity.Users;
import com.example.iranpeyma.repository.UserRepository;
import com.example.iranpeyma.service.UserService;

import javax.persistence.TypedQuery;

public class UserServiceImpl extends BaseServiceImpl<Users,Long, UserRepository> implements UserService {
    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }
    @Override
    public Users findUserByUsernameAndPassword(String username,byte[] password){
        return repository.findUserByUsernameAndPassword(username,password);
    }

    @Override
    public boolean isUserExist(LoginDto loginDto) {
        return findUserByUsernameAndPassword(loginDto.getUName(), loginDto.getPass()) != null;
    }

}
