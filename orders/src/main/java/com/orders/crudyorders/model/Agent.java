package com.orders.crudyorders.model;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "agent")
public class Agent
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // setting strategy to this lets the database control how its set
    @Column(nullable = false)
    private long agentcode;

    private String agentname, workingarea;
    private double comission;
    private String phone, country;

    @OneToMany(mappedBy = "agent",
                cascade = CascadeType.ALL,
                orphanRemoval = true)
    private ArrayList<Customer> customers = new ArrayList<>();
    // this is for the long foreign key in customers?

    @OneToMany(mappedBy = "agent",
                cascade = CascadeType.ALL,
                orphanRemoval = true)
    private ArrayList<Order> orders = new ArrayList<>();

}