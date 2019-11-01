package com.sq.dao;

import com.sq.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 苏强 on 2019/8/19.
 */
public interface UserDao extends JpaRepository<User,Integer> {
}
