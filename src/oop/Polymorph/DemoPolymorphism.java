package oop.Polymorph;

import oop.Inheritance.Employee;
import oop.Inheritance.Manger;

public class DemoPolymorphism {
    public static void main(String[] args) {

        /* this polymorphism rules
        * must have inhertance
        * empManger have olny apporties in Employee
        * But In heap memory Have apporties belonge Manger
        * this Example canot call addres
        *  */

        Employee empManger=new Manger();
        empManger.setId(220);
        empManger.setName("Ibream reda");
        empManger.setSalary(555.7d);
        // empManger.setAdrees(); cant access
        empManger.printDataEmpolyee();
        // when put static is blining method very important
        empManger.printCounterEmpolyee();
        System.out.println("***************************");
        Manger manger=new Manger();
        manger.setId(6);
        manger.setName("Abd ALLAH");
        manger.setAddres("شارع الملاح ");
        manger.setSalary(515885.22d);
        System.out.println("Print Data With Parameter ");
        ParPol.printDataSub(manger);
        System.out.println("***************************");
        System.out.println("updata  Data With return Manger And Print  ");
        Manger manger1= (Manger) ParPol.updatatDataEmpolyee(manger);


    }
}
