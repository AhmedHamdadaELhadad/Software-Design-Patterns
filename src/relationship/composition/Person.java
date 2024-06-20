package relationship.composition;

import java.util.List;

public class Person {

    private  Integer ID;
   private String name;
    private String color;
    private List<Legs> legsList;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public List<Legs> getLegsList() {
        return legsList;
    }

    public void setLegsList(List<Legs> legsList) {
        this.legsList = legsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "color='" + color + '\'' +
                ", ID=" + ID +
                ", name='" + name + '\'' +
                ", legsList=" + legsList +
                '}';
    }
}
