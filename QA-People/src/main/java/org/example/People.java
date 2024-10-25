package org.example;

import java.time.LocalDate;
import java.time.Period;

public class People {
    public People(String firstName, String lastName, LocalDate DOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
    }

    String firstName;
    String lastName;
    LocalDate DOB;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public int getAgeInt() {
        LocalDate dob = DOB;
        LocalDate currentDate = LocalDate.now();
        return Period.between(dob, currentDate).getYears();

    }
}
