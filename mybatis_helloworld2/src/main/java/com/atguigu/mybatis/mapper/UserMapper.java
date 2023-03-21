package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

/**
 * @author Happy Day !
 * @createTime 2023-03-21 18:11
 */
public interface UserMapper {
    int  insertUser();

    void updateUser();

    void deleteUser();

    User queryForParticularUser();

}
