package com.pro.app.controller;
import java.util.ArrayList;
import java.util.Scanner;
import com.pro.app.entity.Employee;
import com.pro.app.handler.EmpHandler;

public class EmpController{
    private Scanner input;
    private EmpHandler empHandler;

    public EmpController(Scanner input, EmpHandler empHandler){
        this.input=input;
        this.empHandler=empHandler;
    }

    private void menu(){
        System.out.println("1. Add Info");
        System.out.println("2. Veiw Info");
        System.out.println("3. Exit");

        System.out.println("Enter your choice :");
    }

    private int i=1;
    private void entry(){
        Employee em = new Employee();
        System.out.print("\nEnter your first name : ");
        em.setFirstName(input.next());

        System.out.print("\nEnter your last name : ");
        em.setLastName(input.next());

        System.out.print("\nEnter your address : ");
        em.setAddress(input.next());

        System.out.print("\nEnter your gender : ");
        em.setGender(input.next());
        em.setId(i);
        empHandler.insert(em);
        i++;
    }

    private void veiwer(){
        System.out.println("-----------------------------------------------");
        for(Employee e:empHandler.getAll()){
            System.out.printf("\n%d \t %s \t %s \t %s\n",e.getId(),
            e.getFullName(),e.getAddress(),e.getGender());
        }
        System.out.println("-----------------------------------------------");
    }

    public void process(){
            menu();
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    entry();
                    break;

                case 2:
                    veiwer();
                    break;

                case 3:
                    System.exit(0);
                    break;
            }
    }
}