package com.melon.userservice.mapper;

import com.melon.userservice.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description
 * @auther panwang1
 * @create 2019-03-05 14:23
 */

@Mapper
public interface UserMapper {

    @Select({"select * from user"})
        List<User> getAllUser();

}
