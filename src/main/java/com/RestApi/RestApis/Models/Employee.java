package com.RestApi.RestApis.Models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employees")
public class Employee {

    private long id;
    private String firstName;
    private String lastName;

    private String surName;

    private Date dateOfBirth;
    private String emailId;

    public Employee() {

    }

    public Employee(String firstName, String lastName,String SurName,Date dateOfBirth, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.surName = surName;
        this.dateOfBirth = dateOfBirth;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "first_name", nullable = false)
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "email_address", nullable = false)
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Column(name = "surName", nullable = false)
    public String getSurName() {
        return surName;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Column(name = "date_Of_Birth", nullable = false)
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", " +
                "firstName=" + firstName + "," +
                " lastName=" + lastName + "," +
                " dateOfBirth=" + dateOfBirth + "," +
                " surName=" + surName + "," +
                " emailId=" + emailId
                + "]";
    }

}
