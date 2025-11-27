package com.yangq.static_proxy02;

/**
 * @author hello28256
 * @version 1.0
 * @description: TODO
 * @date 2025/11/27 20:30
 */

public class UserServiceImpl implements UserService{

    public void add() {
        log("add");
        System.out.println("实现了增加方法");
    }

    public void delete() {
        log("delete");
        System.out.println("实现了删除方法");
    }

    public void update() {
        log("update");
        System.out.println("实现了更新方法");
    }

    public void query() {
        log("query");
        System.out.println("实现了查询方法");
    }
    public void log(String msg){
        System.out.println("使用了"+msg+"方法");
    }
}
