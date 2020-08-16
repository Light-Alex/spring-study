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
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUsers();
    }
}
