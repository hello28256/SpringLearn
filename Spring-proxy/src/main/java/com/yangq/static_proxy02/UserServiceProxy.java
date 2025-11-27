package com.yangq.static_proxy02;


/**
 * @author hello28256
 * @version 1.0
 * @description: TODO
 * @date 2025/11/27 20:35
 */

public class UserServiceProxy implements UserService {
    private UserServiceImpl userService;
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }
    public void delete() {
        userService.delete();
    }
    public void add() {
        userService.add();
    }

    public void update() {
        userService.update();
    }
    public void query() {
        userService.query();
    }

}
