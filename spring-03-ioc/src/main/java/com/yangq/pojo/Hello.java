package com.yangq.pojo;

/**
 * @author hello28256
 * @version 1.0
 * @description: TODO
 * @date 2025/11/26 15:49
 */

public class Hello {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                '}';
    }
}
