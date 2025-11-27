package com.yangq.static_proxy;

/**
 * @author hello28256
 * @version 1.0
 * @description: TODO
 * @date 2025/11/27 17:14
 */

public class Proxy implements Rent{
    private Host host;
    public Proxy(Host host) {
        this.host = host;
    }
    public void rent(){
        seehouse();
        host.rent();
        hetong();
        fee();
    }

    public void seehouse(){
        System.out.println("带客户看房");
    }

    public void hetong(){
        System.out.println("签合同");
    }

    public void fee(){
        System.out.println("收中介费");
    }

}
