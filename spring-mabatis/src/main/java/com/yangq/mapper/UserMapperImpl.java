package com.yangq.mapper;

import com.yangq.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author hello28256
 * @version 1.0
 * @description: TODO
 * @date 2025/11/28 14:03
 */

public class UserMapperImpl implements UserMapper{

    //我们的所有操作，原来都是用sqlSession来执行，现在都是用sqlSessionTemplate
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate (SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }
    public List<User> selectUser() {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
