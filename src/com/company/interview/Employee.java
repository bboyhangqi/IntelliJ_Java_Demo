package com.company.interview;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Date;


public class Employee  {

    public Employee() {

    }

    public Employee(long _id, String _name, Date _joinDate) {
        this.id = _id;
        this.name = _name;
        this.joinDate = _joinDate;
    }

    private long id;
    private String name;
    private Date joinDate;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getJoinDate() {
        return joinDate;
    }


    public void setId(long _id) {
        this.id = _id;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public void setJoinDate(Date _joinDate) {
        this.joinDate = _joinDate;
    }

    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("zhq");
        e1.setJoinDate(new Date("1/18/1990"));

        Employee e2 = new Employee();
        e2.setId(2);
        e2.setName("zmm");
        e2.setJoinDate(new Date("12/31/1975"));

        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(e1);
        employeeArrayList.add(e2);

        System.out.println(new Gson().toJson(employeeArrayList));


    }

}