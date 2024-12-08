package com.Interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Emp implements Comparator<Emp> {
    public Emp(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private int id;
    private String name;
    private int salary;

    public static void main(String[] args) {
        List<Emp> le = new ArrayList<>();

        le.add(new Emp(1,"Rohit", 100));
        le.add(new Emp(2,"Don", 50));
        le.add(new Emp(3,"BaBU", 90));


       var f =  le.stream().sorted(Comparator.comparing(Emp::getSalary)).toList();

       for (Emp e :f){
           System.out.println(e.id);
           System.out.println(e.name);
        }


    }



    @Override
    public int compare(Emp e1, Emp e2) {
        if(e1.getSalary()  == e2.getSalary())
            return 0;
        else if(e1.getSalary()  > e2.getSalary())
            return -1;
        else
            return 1;
    }
}






