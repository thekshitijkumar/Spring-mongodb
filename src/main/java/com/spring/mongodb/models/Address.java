package com.spring.mongodb.models;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document
public class Address {

    private int houseNo;
    private String street;
    private String city;
    private int zipCode;

}
