package com.example.iranpeyma.repository;

import com.example.iranpeyma.base.repository.BaseRepository;
import com.example.iranpeyma.entity.Users;

import java.util.Optional;

public interface UserRepository extends BaseRepository<Users,Long> {
    Optional<Users> findUserByUsernameAndPassword(String username, byte[] password);
}
