package com.crud.jpa.demo.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class User {

    private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private Date birthDate;

    public User(String name, Date birthDate) {
        super();
        this.name = name;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return String.format("User [id=%s, name=%s, birthdate=%s]", id, name, birthDate);
    }

    @Transient
    public String formattedBirthDate() {
        return formatter.format(birthDate);
    }
}