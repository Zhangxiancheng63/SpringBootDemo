package com.zxc.demo.dao;

import com.zxc.demo.pojo.Acc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IAccountDAOImpl implements IAccountDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public IAccountDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int add(Acc account) {
        return jdbcTemplate.update("insert into acc(name, money) values(?, ?)",
                account.getName(), account.getMoney());

    }

    @Override
    public int update(Acc account) {
        return jdbcTemplate.update("UPDATE  acc SET NAME=? ,money=? WHERE id=?",
                account.getName(), account.getMoney(), account.getId());
    }

    @Override
    public int delete(int id) {
        return jdbcTemplate.update("DELETE from TABLE acc where id=?", id);
    }

    @Override
    public Acc findAccById(int id) {
        List<Acc> list = jdbcTemplate.query("select * from acc where id = ?", new Object[]{id}, new BeanPropertyRowMapper(Acc.class));
        if (list != null && list.size() > 0) {
            Acc account = list.get(0);
            return account;
        } else {
            return null;
        }
    }

    @Override
    public List<Acc> findAccList() {
        List<Acc> list = jdbcTemplate.query("select * from acc", new Object[]{}, new BeanPropertyRowMapper(Acc.class));
        if (list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }
}
