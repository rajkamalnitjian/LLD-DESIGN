package com.example.LLD.Collections;

/*
1:-stands for plain java object
2:-contains variable , getter and setter methods
3:  class should be public
4: default public constructor
5: no annotations  used
6: no implementation of class or interface

 */

import java.time.LocalDate;

public class EmployeePojo {

    public String firstName;
    public String lastName;
    private LocalDate startDate;

    public EmployeePojo(String firstName, String lastName, LocalDate startDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.startDate = startDate;
    }

    public String name() {
        return this.firstName + " " + this.lastName;
    }

    public LocalDate getStart() {
        return this.startDate;
    }
}