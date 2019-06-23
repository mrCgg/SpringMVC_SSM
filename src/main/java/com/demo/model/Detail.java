package com.demo.model;

/**
 * describe:
 *
 * @author cgg
 * @date 2019/06/23
 */
public class Detail {
    private String address;
    private Integer phone;

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

    @Override
    public String toString() {
        return "Detail{" +
                "address='" + address + '\'' +
                ", phone=" + phone +
                '}';
    }
}
