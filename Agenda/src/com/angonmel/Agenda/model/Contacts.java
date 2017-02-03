package com.angonmel.Agenda.model;


public class Contacts {


    private String name;
    private String phone;


    public Contacts(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString(){
        return "\n[\t" + getName() + "\n\t" + getPhone() + "\n" ;


    }

    public String getName() {
        return name;
    }

    public void setName(String inputName) {
        this.name = inputName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phoneEntered) {
        this.phone = phoneEntered;
    }





}
