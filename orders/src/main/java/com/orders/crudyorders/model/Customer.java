package com.orders.crudyorders.model;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
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

    public Customer(){}

    public Customer(String custname, String custcity, String workingarea, String custcountry, String grade, double openingamt, double recieveamt, double paymentamt, double outstandingamt, String phone, long agentcode) {
        this.custname = custname;
        this.custcity = custcity;
        this.workingarea = workingarea;
        this.custcountry = custcountry;
        this.grade = grade;
        this.openingamt = openingamt;
        this.recieveamt = recieveamt;
        this.paymentamt = paymentamt;
        this.outstandingamt = outstandingamt;
        this.phone = phone;
        this.agentcode = agentcode;
    }

    public long getCustcode() {
        return custcode;
    }

    public void setCustcode(long custcode) {
        this.custcode = custcode;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getCustcity() {
        return custcity;
    }

    public void setCustcity(String custcity) {
        this.custcity = custcity;
    }

    public String getWorkingarea() {
        return workingarea;
    }

    public void setWorkingarea(String workingarea) {
        this.workingarea = workingarea;
    }

    public String getCustcountry() {
        return custcountry;
    }

    public void setCustcountry(String custcountry) {
        this.custcountry = custcountry;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getOpeningamt() {
        return openingamt;
    }

    public void setOpeningamt(double openingamt) {
        this.openingamt = openingamt;
    }

    public double getRecieveamt() {
        return recieveamt;
    }

    public void setRecieveamt(double recieveamt) {
        this.recieveamt = recieveamt;
    }

    public double getPaymentamt() {
        return paymentamt;
    }

    public void setPaymentamt(double paymentamt) {
        this.paymentamt = paymentamt;
    }

    public double getOutstandingamt() {
        return outstandingamt;
    }

    public void setOutstandingamt(double outstandingamt) {
        this.outstandingamt = outstandingamt;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getAgentcode() {
        return agentcode;
    }

    public void setAgentcode(long agentcode) {
        this.agentcode = agentcode;
    }
}