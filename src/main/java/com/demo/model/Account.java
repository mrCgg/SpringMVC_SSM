package com.demo.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

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
//    private Detail detail;
    private List<Detail> list;
    private Map<String,Detail> map;
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

//    public Detail getDetail() {
//        return detail;
//    }
//
//    public void setDetail(Detail detail) {
//        this.detail = detail;
//    }

    public List<Detail> getList() {
        return list;
    }

    public void setList(List<Detail> list) {
        this.list = list;
    }

    public Map<String, Detail> getMap() {
        return map;
    }

    public void setMap(Map<String, Detail> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
