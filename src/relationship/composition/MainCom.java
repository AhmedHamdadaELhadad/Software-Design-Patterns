package relationship.composition;

import java.util.ArrayList;

public class MainCom {
    public static void main(String[] args) {
        /*
         *  Compostion  is Strong reationship most (Many to one) and can (one to one)
         *  IN This Example
         *  Frist Creat Object of Person  and assgin vaule to legs thourgh object person

         *  if delect person object deafualt delect legs
         *  This compostion  ship bettween classes
         * */


        Person person=new Person();
        person.setID(4);
        person.setColor("white");
        person.setName("Mostafa");

        // assgin vaule of legs thogrth person

        person.setLegsList(new ArrayList<>());
        person.getLegsList().add(0,new Legs());
        person.getLegsList().add(1,new Legs());
        person.getLegsList().get(0).setNumber(2);
        person.getLegsList().get(1).setNumber(4);
        person.getLegsList().get(0).setShap("such kongora ");
        person.getLegsList().get(1).setShap("such Dog ");


        System.out.println(person.toString());





    }
}
