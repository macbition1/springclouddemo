package com.chunbiao.repository;

import com.chunbiao.entity.User;

import java.util.List;

public interface UserRepository {
    public User findById(long id);

}
