package com.demo.model;

import java.util.Date;

/**
 * describe:
 *
 * @author cgg
 * @date 2019/06/23
 */
public class Detail {
    private String address;
    private Integer phone;
    private Date date;
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "address='" + address + '\'' +
                ", phone=" + phone +
                ", date=" + date +
                '}';
    }
}
