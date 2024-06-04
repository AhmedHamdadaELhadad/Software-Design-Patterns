package oop.composition;

public class Legs {
    private Integer number;
    private String shap;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getShap() {
        return shap;
    }

    public void setShap(String shap) {
        this.shap = shap;
    }


    @Override
    public String toString() {
        return "Legs{" +
                "number=" + number +
                ", shap='" + shap + '\'' +
                '}';
    }
}
