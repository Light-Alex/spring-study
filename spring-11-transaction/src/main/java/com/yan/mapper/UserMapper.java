package com.yan.mapper;

import com.yan.pojo.User;

import java.util.List;

public interface UserMapper {
    // 查询所有用户
    List<User> selectUsers();

    // 添加一个用户
    int addUser(User user);

    // 删除一个用户
    int deleteUser(int id);
}
