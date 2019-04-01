package com.java.pojo;

public class Student {

    private String id;
    private String psw;
    private String phone;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", psw='" + psw + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private Integer age;

}
