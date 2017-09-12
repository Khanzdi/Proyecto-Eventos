package com.example.personal.info_eventos.Domain;

/**
 * Created by Personal on 11/09/2017.
 */

public class User {
    private String name;
    private String lastName;
    private String userName;
    private String password;
    private int age;

    public User(String name, String lastName, String userName, String password,int age){
        this.setName(name);
        this.setLastName(lastName);
        this.setUserName(userName);
        this.setPassword(password);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
