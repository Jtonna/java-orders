package com.orders.crudyorders.model;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer
{
    @Id
    @GeneratedValue
    private long custcode;

    @Column(nullable = false)
    private String custname;

    private String custcity, workingarea, custcountry, grade;
    private double openingamt, recieveamt, paymentamt, outstandingamt;
    private String phone;

    @OneToMany
    @JoinColumn(name = "agentcode", nullable = false)
    // connects this to the agent model
    private long agentcode;

}