package oop.Inheritance;

public class Employee {

    private  int id ;
    private String name;
    private double salary;
    protected static int count;
    public String getName() {
        return name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void printDataEmpolyee(){

        System.out.println("Type Employee Has Id : "+this.getId()
                +" and Name is  "+this.getName()+" and Salary is"+this.getSalary()
                );
    }

    public static void printCounterEmpolyee(){

       System.out.println("IN THE Parent ");
    }
}
