package com.yangq.pojo;

/**
 * @author hello28256
 * @version 1.0
 * @description: TODO
 * @date 2025/11/25 09:49
 */

public class Address {
    private String address;

    public Address() {
    }

    public Address(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
