package solid.OCP.berfore;



public class ReportGenerator {



    public void generate(Reportable report) {

    if(report instanceof ExcelReport) {
        //create excel report
    } else if(report instanceof PdfReport) {
        //create pdf report
    }
}


    public static void main(String[] args) {

        ReportGenerator generator = new ReportGenerator();
        Object[][] data = new Object[0][];
        generator.generate(new PdfReport(data));
        generator.generate(new ExcelReport(data));
    }





}

