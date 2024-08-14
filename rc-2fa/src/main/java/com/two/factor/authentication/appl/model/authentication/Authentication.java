package com.two.factor.authentication.appl.model.authentication;

import java.sql.Timestamp;

public class Authentication {
    private int id;
    private String employee_number;
    private String OTP;
    private Timestamp created_at;
    private Timestamp updated_at;

    public Authentication() {
    }

    public Authentication(int id, String employee_number, String OTP, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.employee_number = employee_number;
        this.OTP = OTP;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployee_number() {
        return employee_number;
    }

    public void setEmployee_number(String employee_number) {
        this.employee_number = employee_number;
    }


    public void setOTP(String OTP) {
        this.OTP = OTP;
    }

    public String getOTP() {
        return OTP;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setUpdated_at(Timestamp updated_at) {this.updated_at = updated_at;}

    public Timestamp getUpdated_at() {return updated_at; }
}
