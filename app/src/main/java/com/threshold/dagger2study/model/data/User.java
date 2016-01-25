package com.threshold.dagger2study.model.data;

/**
 * Created by Threshold on 2016/1/24.
 */
public class User {

    private String name,sex,address, phone;
    private int age;

    public User() {
    }

    public User(String name, String sex, String address, String phone, int age) {
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
