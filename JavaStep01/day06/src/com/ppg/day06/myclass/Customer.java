package com.ppg.day06.myclass;

public class Customer {
    String phoneNum;
    String customerName;
    String idCardNum;
    String userName;
    String address;

    public Customer(String phoneNum, String customerName, String idCardNum, String userName, String address) {
        this.phoneNum = phoneNum;
        this.customerName = customerName;
        this.idCardNum = idCardNum;
        this.userName = userName;
        this.address = address;
    }

    public Customer() {
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getIdCardNum() {
        return idCardNum;
    }

    public void setIdCardNum(String idCardNum) {
        this.idCardNum = idCardNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "phoneNum='" + phoneNum + '\'' +
                ", customerName='" + customerName + '\'' +
                ", idCardNum='" + idCardNum + '\'' +
                ", userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
