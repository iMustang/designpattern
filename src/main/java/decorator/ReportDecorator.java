package decorator;

public abstract class ReportDecorator implements ISchoolReport {
    private ISchoolReport sr;

    public ReportDecorator(ISchoolReport sr) {
        this.sr = sr;
    }

    public void report() {
        this.sr.report();
    }

}