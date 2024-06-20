package solid.OCP.after;

import solid.OCP.berfore.ReportGenerator;

import java.util.ArrayList;
import java.util.Arrays;

public class ReportGenerator_OCP       {

        // this True can open to Exestion
    public void generate(Reportable_OCP report) {

        //pre-processing

        report.generate();

        //post-processing
    }



    public static void main(String[] args) {

        ReportGenerator_OCP generator_ocp = new ReportGenerator_OCP();
        generator_ocp.generate( new PdfReport_OCP());
        generator_ocp.generate( new ExcelReport_OCP());

        ReportGenerator_OCPp generator_ocpp = new WordReport();






    }

}
