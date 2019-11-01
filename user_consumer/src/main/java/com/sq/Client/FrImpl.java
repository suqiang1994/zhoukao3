package com.sq.Client;

import com.sq.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 苏强 on 2019/8/20.
 */
@Component
public class FrImpl implements Fr {
    @Override
    public List<User> list() {
        ArrayList<User> alist=new ArrayList<>();
        return alist;
    }
}
