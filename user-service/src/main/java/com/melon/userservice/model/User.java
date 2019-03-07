package com.melon.userservice.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description
 * @auther panwang1
 * @create 2019-03-05 14:23
 */


public class User implements Serializable {

    private static final long serialVersionUID = -333908550708380535L;
    private Long id;
    private String name;
    private String password;
    private Date createtime;

    public User() {
    }

    public User(Long id, String name, String password, Date createtime) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.createtime = createtime;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
