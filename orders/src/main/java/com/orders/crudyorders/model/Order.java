package com.orders.crudyorders.model;

import javax.persistence.*;

public class Order
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long ordnum;

    private double ordamount, advanceamount;

    @OneToMany
    @JoinColumn(name = "customer", nullable = false)
    private long custcode;
    // this is a long foreign key

    @OneToMany
    @JoinColumn(name = "agent", nullable = false)
    private long agentcode;

    private String orddescription;
}