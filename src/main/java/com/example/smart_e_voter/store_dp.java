package com.example.smart_e_voter;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class store_dp {

    private String name, phone, address, age;

    public store_dp() {
    }

    public store_dp(String name, String phone, String address, String age) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }
}
