package com.yangq.pojo;


/**
 * @author hello28256
 * @version 1.0
 * @description: TODO
 * @date 2025/11/27 19:56
 */

public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("增加一个用户");
    }
    public void delete() {
        System.out.println("删除一个用户");
    }
    public void update() {
        System.out.println("更新一个用户");
    }
    public void query() {System.out.println("检索一个用户");}
}
