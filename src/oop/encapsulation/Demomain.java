package oop.encapsulation;

public class Demomain {

    public static void main(String ... arg){
        /*
        * encapsulation use to control of data and bling data
        * and prevent of asses data do not belong to
        * employee.name="a"; use setName can avoid this
        *ASESS MODIFER AND Setter and Getter
        * */
        Employee employee=new Employee();

        employee.setId(1);
        employee.setName("Ahmed Hamada Elhdad");
        employee.setPhone("+201033118994");
        employee.setSalary(25000);

        System.out.println(employee.getName()+" HAS ID Is : "+employee.getId()+
                " AND Email is "+employee.getEmail() +" AND Phone is "+employee.getPhone()
        +" AND Salary"+employee.getSalary());






    }
}
