package oop.aggregation;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*
        *  Aggregation is weak reation ship most (Many to one) and can (one to one)
        *  IN This Example
        *  Frist Creat list object of cousrea and assgin attbute to vaule
        *  and assgin to Student
        *  if delect Student object not affect to cousrea
        *  This Aggregation ship bettween classes
        * */



        Cousres cousres1 =new Cousres();
        Cousres cousres2 =new Cousres();
        cousres1.setName("How to learn java ");
        cousres2.setName("How to learn c++ ");
        cousres1.setId(1);
        cousres2.setId(2);
        cousres1.setLevel(2);
        cousres2.setLevel(1);


        ArrayList<Cousres>cousresList=new ArrayList<>();

        cousresList.add(cousres1);
        cousresList.add(cousres2);

        Student student=new Student();
        student.setId(2);
        student.setGmail("aajnn@gmail.com");
        student.setName("Ahmed 3bd elmosad");

        //set list in set cousre after assgin vaule of Cousrea
        student.setCousres(cousresList);

       System.out.println( student.toString());

        // if cousrea is null can print detail of cousres

            student=null;


        System.out.println(cousres1.toString());

    }
}
