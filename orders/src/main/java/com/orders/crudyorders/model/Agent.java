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

    public Agent(String agentname, String workingarea, double comission, String phone, String country) {
        this.agentname = agentname;
        this.workingarea = workingarea;
        this.comission = comission;
        this.phone = phone;
        this.country = country;
    }

    public long getAgentcode() {
        return agentcode;
    }

//    public void setAgentcode(long agentcode) {
//        this.agentcode = agentcode;
//    }

    public String getAgentname() {
        return agentname;
    }

    public void setAgentname(String agentname) {
        this.agentname = agentname;
    }

    public String getWorkingarea() {
        return workingarea;
    }

    public void setWorkingarea(String workingarea) {
        this.workingarea = workingarea;
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
}