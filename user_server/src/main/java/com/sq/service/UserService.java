package com.sq.service;

import com.sq.dao.UserDao;
import com.sq.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 苏强 on 2019/8/19.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<User> list() {
        return userDao.findAll();
    }
}
