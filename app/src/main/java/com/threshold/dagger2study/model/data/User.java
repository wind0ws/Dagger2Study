package com.threshold.dagger2study.model.data;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Threshold on 2016/1/24.
 */
public class User implements Parcelable {

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.age);
        dest.writeString(this.sex);
        dest.writeString(this.phone);
        dest.writeString(this.address);
    }

    protected User(Parcel in) {
        this.name = in.readString();
        this.age = in.readInt();
        this.sex = in.readString();
        this.phone = in.readString();
        this.address = in.readString();
    }

    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        public User[] newArray(int size) {
            return new User[size];
        }
    };
}
