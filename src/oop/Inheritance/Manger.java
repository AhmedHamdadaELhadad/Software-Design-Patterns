package oop.Inheritance;

public class Manger extends Employee{

    private String addres;
    static int conuter=0;

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }




public void printDataEmpolyee(){

    System.out.println("Type Manger Has Id : "+this.getId()
            +" and Name is  "+this.getName()+" and Salary is"+this.getSalary()
            +" Addrees is "+this.getAddres());
}

//Method  bling
    public static void printCounterEmpolyee(){

        System.out.println("IN THE child ");
    }


}
