package com.yangq.static_proxy;

/**
 * @author hello28256
 * @version 1.0
 * @description: TODO
 * @date 2025/11/27 17:14
 */

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        //代理
        Proxy proxy = new Proxy(host);
        proxy.rent();

    }
}
