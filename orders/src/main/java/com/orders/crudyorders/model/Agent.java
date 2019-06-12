package com.orders.crudyorders.model;

import javax.persistence.*;

@Entity
@Table(name = "agent")
public class Agent
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // setting strategy to this lets the database control how its set
    private long agentcode;

    private String agentname, workingarea;
    private double comission;
    private String phone, country;

    
}