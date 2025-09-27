package com.workintech.developers;

public class Employee {
    private long id;
    private String name;
    private double salary;
    public Employee(long id, String name, double salary){
        this.id =id;
        this.name = name;
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void work(){
        System.out.println("Employee starts to working");
    }

}
