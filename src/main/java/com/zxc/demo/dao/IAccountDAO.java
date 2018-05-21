package com.zxc.demo.dao;

import com.zxc.demo.pojo.Acc;

import java.util.List;

public interface IAccountDAO {
    int add(Acc account);

    int update(Acc account);

    int delete(int id);

    Acc findAccById(int id);

    List<Acc> findAccList();
}