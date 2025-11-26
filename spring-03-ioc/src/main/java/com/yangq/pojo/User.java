package com.yangq.pojo;

/**
 * @author hello28256
 * @version 1.0
 * @description: TODO
 * @date 2025/11/26 16:58
 */

public class User {

    private String name;
    private int age;
    public User(String name, int age) {this.name = name;this.age = age;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
}
