package com.sq.Client;

import com.sq.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 苏强 on 2019/8/19.
 */
@FeignClient(name = "user",fallback = FrImpl.class)
@Component
public interface Fr {
    @RequestMapping(value = "/user/list",method = RequestMethod.GET)
    public List<User> list();


}
