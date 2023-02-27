package com.example.mathcompetencysurvey;

public class Address {
    private String street;
    private String district;
    private String postcode;
    private String state;

    public Address() {
        System.out.println("An address is constructed");
    }

    // constuctor can be overloaded (repeated but with different parameters)
    public Address(String street, String district, String postcode, String state) {
        this.street = street;
        this.district = district;
        this.postcode = postcode;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public static void main(String args[]) {
        Address addr = new Address(); // calling a constructor
        Address addr2 = new Address("Sri Iskandar", "Tronoh", "31750", "Perak");


    }
}
