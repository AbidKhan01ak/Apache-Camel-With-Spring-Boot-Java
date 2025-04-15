package com.SpringWithCamel.Camel.boot.model;


import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "user")
public class User {

    public int id;

    public String name;

    public String email;

    public User() {}


}
