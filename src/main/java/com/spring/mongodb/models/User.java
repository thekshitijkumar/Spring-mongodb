package com.spring.mongodb.models;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document
public class User {
    private String name;
    private int age;
    private int bmi;
    private Address address;
}
