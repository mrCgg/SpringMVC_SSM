package com.demo.model;

import java.io.Serializable;

/**
 * describe:
 *
 * @author cgg
 * @date 2019/06/23
 */
public class Account implements Serializable {
    private String username;
    private String password;
    private Double money;
    private Detail detail;
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                ", Detail=" + detail +
                '}';
    }
}
