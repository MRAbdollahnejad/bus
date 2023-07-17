package com.example.iranpeyma.service.impl;

import com.example.iranpeyma.base.service.BaseServiceImpl;
import com.example.iranpeyma.command.LoginCommand;
import com.example.iranpeyma.entity.Users;
import com.example.iranpeyma.repository.UserRepository;
import com.example.iranpeyma.service.UserService;

import javax.persistence.NoResultException;
import java.util.Optional;

public class UserServiceImpl extends BaseServiceImpl<Users,Long, UserRepository> implements UserService {
    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }
    @Override
    public Optional<Users> findUserByUsernameAndPassword(String username, byte[] password){
        return repository.findUserByUsernameAndPassword(username,password);
    }

    @Override
    public boolean isUserExist(LoginCommand loginCommand) throws NoResultException {
        return findUserByUsernameAndPassword(loginCommand.getUName(), loginCommand.getPass()).isPresent();
    }

    @Override
    public Users findUserByUsername(LoginCommand loginCommand) {
        return repository.findUserByUsername(loginCommand);
    }

}
