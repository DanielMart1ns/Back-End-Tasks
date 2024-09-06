package com.daniel.gender.list;

public class Person {
    private String name;
    private String gender;

    public Person(String name, String gender){
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }
}
