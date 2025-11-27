package com.yangq.static_proxy;

/**
 * @author hello28256
 * @version 1.0
 * @description: TODO
 * @date 2025/11/27 17:14
 */

public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
