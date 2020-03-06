package com.chunbiao.repository;

import com.chunbiao.entity.User;

public interface UserRepository {
    public User login(String username,String password);
}
