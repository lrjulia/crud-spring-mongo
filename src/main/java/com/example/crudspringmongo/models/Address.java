package com.example.crudspringmongo.models;

import lombok.Data;

@Data
public class Address {
    private String country;
    private String city;
    private String postCode;
}
