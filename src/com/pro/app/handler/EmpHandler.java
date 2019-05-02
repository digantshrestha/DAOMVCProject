package com.pro.app.handler;

import java.util.ArrayList;

import com.pro.app.entity.Employee;

public class EmpHandler{
    private ArrayList<Employee> emList;

    public EmpHandler(){
        emList=new ArrayList<>();
    }

    public void insert(Employee emp){
        emList.add(emp);
    }

    public ArrayList<Employee> getAll(){
        return emList;
    }
}