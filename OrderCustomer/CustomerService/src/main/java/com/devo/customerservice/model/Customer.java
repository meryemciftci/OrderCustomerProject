package com.devo.customerservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "customers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerid;
    private boolean hasOrderAuthorization;
    private String name;
    private String email;
    private String phone;
    private String address;


    //buna bakman lazım neden
    public boolean getHasOrderAuthorization() {
        return hasOrderAuthorization;
    }
}