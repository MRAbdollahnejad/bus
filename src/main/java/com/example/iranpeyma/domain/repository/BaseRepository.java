package com.example.iranpeyma.domain.repository;

import com.example.iranpeyma.domain.entity.BaseEntity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface BaseRepository<T extends BaseEntity<ID>,ID extends Serializable>{
    T save(T t);

    List<T> saveALl(Collection<T> tCollection);

    Optional<T> findById(ID id);

    T findByIdNotOptional(ID id);

    void deleteById(ID id);

    List<T> findAll();

    void beginTransaction();
    void commitTransaction();
}
