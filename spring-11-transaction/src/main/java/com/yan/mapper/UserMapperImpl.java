package com.yan.mapper;

import com.yan.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{

    // 在MyBatis的时候，都是用sqlSession来执行SQL语句
    // 在Spring的时候，使用SqlSessionTemplate
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession){
        this.sqlSession = sqlSession;
    }

    public List<User> selectUsers() {

        User user = new User(6, "小王", "25541");

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.addUser(user);
        mapper.deleteUser(6);

        return mapper.selectUsers();
    }

    public int addUser(User user) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.addUser(user);
    }

    public int deleteUser(int id) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.deleteUser(id);
    }
}
