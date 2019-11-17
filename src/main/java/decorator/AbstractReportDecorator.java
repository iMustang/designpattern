package decorator;

public abstract class AbstractReportDecorator implements ISchoolReport {
    private ISchoolReport sr;

    public AbstractReportDecorator(ISchoolReport sr) {
        this.sr = sr;
    }

    public void report() {
        this.sr.report();
    }

}