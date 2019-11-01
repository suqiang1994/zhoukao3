package com.sq.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by 苏强 on 2019/8/19.
 */
@Entity
@Table(name = "t_user01")
public class User {
    @Id
    private Integer id;
    private String username;
    private String pwd;
    private String shengri;
    private String aihao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getShengri() {
        return shengri;
    }

    public void setShengri(String shengri) {
        this.shengri = shengri;
    }

    public String getAihao() {
        return aihao;
    }

    public void setAihao(String aihao) {
        this.aihao = aihao;
    }

    public User(Integer id, String username, String pwd, String shengri, String aihao) {
        this.id = id;
        this.username = username;
        this.pwd = pwd;
        this.shengri = shengri;
        this.aihao = aihao;
    }

    public User() {
    }
}
