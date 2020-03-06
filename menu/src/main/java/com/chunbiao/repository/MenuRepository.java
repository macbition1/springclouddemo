package com.chunbiao.repository;

import com.chunbiao.entity.Menu;

import java.util.List;

public interface MenuRepository {
    public List<Menu> findAll(int index, int limit); //分页查询
    public int count();
    public Menu findById(long id);
    public void save(Menu menu);
    public void update(Menu menu);
    public void deleteById(long id);
}
