package com.example.demo.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

public class People {
    private String name;
    private Integer birthdayYear;
    private Integer birthdayMonth;
    private Integer birthdayDay;

    public People() {
    }

    public People(String name, Integer birthdayYear, Integer birthdayMonth, Integer birthdayDay) {
        this.name = name;
        this.birthdayYear = birthdayYear;
        this.birthdayMonth = birthdayMonth;
        this.birthdayDay = birthdayDay;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBirthdayYear() {
        return birthdayYear;
    }

    public void setBirthdayYear(Integer birthdayYear) {
        this.birthdayYear = birthdayYear;
    }

    public Integer getBirthdayMonth() {
        return birthdayMonth;
    }

    public void setBirthdayMonth(Integer birthdayMonth) {
        this.birthdayMonth = birthdayMonth;
    }

    public Integer getBirthdayDay() {
        return birthdayDay;
    }

    public void setBirthdayDay(Integer birthdayDay) {
        this.birthdayDay = birthdayDay;
    }
}
