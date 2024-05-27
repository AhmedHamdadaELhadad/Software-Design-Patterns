package oop.Inheritance;

public class MainIn {

    public static void main(String[] args) {

            Employee employee=new Employee();
            Manger manger=new Manger();

            manger.setId(1);
            manger.setName("Ahmed Ibream");
            manger.setSalary(2222.33d);
            manger.setAddres("شارع محمد مراد بجوار برج الساعه ");
            manger.printDataEmpolyee();

            employee.setId(12);
            employee.setName("Mostafa reda");
            employee.setSalary(99604.2d);

            employee.printDataEmpolyee();













    }
}
