package com.aananev.demo.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class CurrencyRate {
    @Id @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column
    private String id;
    @Column
    private LocalDate date;
    @Column
    private String charCode;
    @Column
    private double rate;

    public CurrencyRate(){}
    public CurrencyRate(String id, LocalDate date, String charCode, double rate) {
        this.id = id;
        this.date = date;
        this.charCode = charCode;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "CurrencyRate{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", charCode='" + charCode + '\'' +
                ", rate=" + rate +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getCharCode() {
        return charCode;
    }

    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
