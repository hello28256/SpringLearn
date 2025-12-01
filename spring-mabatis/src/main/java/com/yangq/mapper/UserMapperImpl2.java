package com.yangq.mapper;

import com.yangq.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author hello28256
 * @version 1.0
 * @description: TODO
 * @date 2025/12/1 08:13
 */

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    public List<User> selectUser() {
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();
        //return getSqlSession().getMapper(UserMapper.class).selectUser();
        return users;
    }
}
