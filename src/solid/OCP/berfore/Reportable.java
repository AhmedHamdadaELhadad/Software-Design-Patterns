package solid.OCP.berfore;
/* Before of OCP  have interface and implements  in main can detamind any class this ERRor

*  IF Need add Class WordReport  can do  if(report instanceof WordReport) {
    suoltion put generate in super class interface and can add any class easly

*/
public interface Reportable {


}

class ExcelReport implements Reportable {

    Object[][] data;

    public ExcelReport(Object[][] data) {
        this.data = data;
    }
}

class PdfReport implements Reportable {

    Object[][] data;

    public PdfReport(Object[][] data) {
        this.data = data;
    }

}