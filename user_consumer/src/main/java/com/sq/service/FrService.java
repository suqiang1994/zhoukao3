package com.sq.service;

import com.sq.Client.Fr;
import com.sq.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 苏强 on 2019/8/19.
 */
@Service
public class FrService {
    @Autowired
    private Fr fr;

    public List<User> list() {
        return fr.list();
    }
}
