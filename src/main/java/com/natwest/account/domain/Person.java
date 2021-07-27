package com.natwest.account.domain;

public class Person {
    public Person() {
        super();
    }
    public Person(String firstname, int age) {
        super();
        this.firstname = firstname;
        this.age = age;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    private String firstname;
    private int age;
    @Override    public String toString() {
        return "Person [firstname=" + firstname + ", age=" + age + "]";
    }
}