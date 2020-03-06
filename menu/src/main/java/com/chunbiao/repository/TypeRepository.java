package com.chunbiao.repository;

import com.chunbiao.entity.Type;

import java.util.List;

public interface TypeRepository {
    public Type findById(long id);
    public List<Type> findAll();
}
