package com.zxc.demo.service;

import com.zxc.demo.pojo.Acc;

import java.util.List;

public interface IAccountService {

    int add(Acc account);

    int update(Acc account);

    int delete(int id);

    Acc findAccountById(int id);

    List<Acc> findAccountList();

}