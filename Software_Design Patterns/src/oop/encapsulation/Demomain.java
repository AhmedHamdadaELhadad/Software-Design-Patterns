package oop.encapsulation;

import java.sql.SQLOutput;

public class Demomain {

    public static void main(String ... arg){

        Employee employee=new Employee();
        employee.setEmail("ahmed.@gmail.com");
        employee.setId(1);
        employee.setName("Ahmed Hamada Elhdad");
        employee.setPhone("+201033118994");
        employee.setSalary(25000);

        System.out.println(employee.getName()+" HAS ID Is : "+employee.getId()+
                " AND Email is "+employee.getEmail() +" AND Phone is "+employee.getPhone()
        +" AND Salary"+employee.getSalary());






    }
}
