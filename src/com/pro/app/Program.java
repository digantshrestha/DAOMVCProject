package com.pro.app;

import java.util.ArrayList;
import java.util.Scanner;
import com.pro.app.controller.EmpController;;
import com.pro.app.entity.Employee;
import com.pro.app.handler.EmpHandler;
import com.pro.app.util.CustomList;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EmpHandler empHandler=new EmpHandler();
        int i=1;
        EmpController ec=new EmpController(input, empHandler);

        while (true) {
            ec.process();
        }
    }
}