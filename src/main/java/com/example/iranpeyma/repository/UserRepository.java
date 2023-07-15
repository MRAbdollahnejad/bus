package com.example.iranpeyma.repository;

import com.example.iranpeyma.base.repository.BaseRepository;
import com.example.iranpeyma.entity.Users;

public interface UserRepository extends BaseRepository<Users,Long> {
    Users findUserByUsernameAndPassword(String username,byte[] password);
}
