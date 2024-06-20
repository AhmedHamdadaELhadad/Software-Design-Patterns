package solid.OCP.after;

public interface ReportGenerator_OCPp {


    default public void generate(Reportable_OCP report) {

        //pre-processing

        report.generate();

        //post-processing
    }
}
