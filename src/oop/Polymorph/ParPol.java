package oop.Polymorph;

import oop.Inheritance.Employee;
import oop.Inheritance.Manger;

public class ParPol {

    /*
    * can WE CREAT MEYHOD TYPE OF EMPOLYEE
    * USE PAY MANGER AND ANY SUB CLASS
    *
    * */

    public static void printDataSub(Employee employee) {
        if (employee instanceof Manger) {
            System.out.println("print Hello Manger");
        }

        System.out.println("ID is "+employee.getId());
        System.out.println("Name is "+employee.getName());
        System.out.println("Salary is "+employee.getSalary());
        System.out.println("Address is "+((Manger) employee).getAddres());
    }


    public static Employee updatatDataEmpolyee(Employee employee){
        Manger manger= (Manger) employee;
        manger.setId(9);
        manger.setName("Khalad Abo Rayea");
        manger.setAddres("شارع الزراعه ");
        manger.setSalary(1.22d);
        printDataSub(manger);
        return manger;

    }

}
