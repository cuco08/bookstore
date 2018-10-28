package com.galeanos.bookstore.model;

import java.util.Date;

public class Author {
    private int id;
    private String name;
    private String lastName;
    private Date birthday;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String l) {
        lastName = l;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date b) {
        birthday = b;
    }
}
