package com.melon.userservice.model;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description
 * @auther panwang1
 * @create 2019-03-05 14:23
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = -333908550708380535L;
    private Long id;
    private String name;
    private String password;
    private Date createtime;
}


