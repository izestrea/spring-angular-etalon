package com.reigncode.etalon.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Denis on 3/15/2015.
 */
@Entity
@Table(name = "persons")
public class Person extends AbstractEntity {

    private String firstName;
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
