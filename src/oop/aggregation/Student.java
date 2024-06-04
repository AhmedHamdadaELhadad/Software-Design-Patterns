package oop.aggregation;

import java.util.List;

public class Student {

    private Integer Id;

    private String name;
    private String gmail;

    // Many Cousrea to one Student
    private List<Cousres> cousres;


    public List<Cousres> getCousres() {
        return cousres;
    }

    public void setCousres(List<Cousres> cousres) {
        this.cousres = cousres;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "cousres=" + cousres.toString() +
                ", Id=" + Id +
                ", name='" + name + '\'' +
                ", gmail='" + gmail + '\'' +
                '}';
    }
}
