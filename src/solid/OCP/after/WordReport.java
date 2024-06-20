package solid.OCP.after;

public class WordReport   implements ReportGenerator_OCPp , Reportable_OCP{


    public void generate() {
        System.out.println("Excel Report OCP");
    }

}
