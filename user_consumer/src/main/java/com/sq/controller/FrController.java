package com.sq.controller;

import com.sq.entity.User;
import com.sq.service.FrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 苏强 on 2019/8/19.
 */
@Controller
public class FrController {
    @Autowired
    private FrService frService;

    @RequestMapping("/list")
    public String list(HttpServletRequest request){
        List<User> list=frService.list();
        request.setAttribute("list",list);
        return "list";
    }

    @RequestMapping("aa")
    public String aa(){
        return "aa";
    }

}
