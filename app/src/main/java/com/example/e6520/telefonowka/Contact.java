package com.example.e6520.telefonowka;

/**
 * Created by E6520 on 2017-04-25.
 */

public class Contact {
    String name;
    String phoneNumber;

    public Contact(String clientName,String clientPhoneNumber){
        this.name=clientName;
        this.phoneNumber= clientPhoneNumber;
    }

    @Override
    public String toString() {
        return this.name + " : " + this.phoneNumber;
    }
}

