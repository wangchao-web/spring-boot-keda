package com.kedacom.pojo;

public class User {
    public User(String names, int age) {
        this.names = names;
        this.age = age;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "names='" + names + '\'' +
                ", age=" + age +
                '}';
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String names;
    private int age;
}
