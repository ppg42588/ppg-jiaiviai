package com.ppg.day06;

import com.ppg.day06.myclass.Customer;

public class Demo2 {
    public static void main(String[] args) {
        Customer customer=new Customer();
        customer.setPhoneNum("18711245537");
        customer.setCustomerName("ppg");
        customer.setIdCardNum("403672837594482940");
        customer.setUserName("lilk");
        customer.setAddress("hunan");
        System.out.println(customer.toString());
    }
}
