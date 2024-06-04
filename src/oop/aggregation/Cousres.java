package oop.aggregation;

public class Cousres {

    private Integer Id;

    private String name;
    private Integer level;


    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cousres{" +
                "name='" + name + '\'' +
                '}';
    }
}
