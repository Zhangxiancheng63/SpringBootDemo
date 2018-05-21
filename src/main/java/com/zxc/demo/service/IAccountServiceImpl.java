package com.zxc.demo.service;

import com.zxc.demo.dao.IAccountDAO;
import com.zxc.demo.pojo.Acc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IAccountServiceImpl implements IAccountService {
    private IAccountDAO accountDAO;

    @Autowired
    public IAccountServiceImpl(IAccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public int add(Acc account) {
        return accountDAO.add(account);
    }

    @Override
    public int update(Acc account) {
        return accountDAO.update(account);
    }

    @Override
    public int delete(int id) {
        return accountDAO.delete(id);
    }

    @Override
    public Acc findAccountById(int id) {
        return accountDAO.findAccById(id);
    }

    @Override
    public List<Acc> findAccountList() {
        return accountDAO.findAccList();
    }
}
