package com.chunbiao.repository;

import com.chunbiao.entity.Admin;

public interface AdminRepository {
    public Admin login(String username,String password);
}
