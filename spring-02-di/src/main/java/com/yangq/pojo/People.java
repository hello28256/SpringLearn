package com.yangq.pojo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author hello28256
 * @version 1.0
 * @description: TODO
 * @date 2025/11/26 20:58
 */

public class People {
    @Autowired
    Dog dog;
    @Autowired
    Cat cat;
    private String name;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
