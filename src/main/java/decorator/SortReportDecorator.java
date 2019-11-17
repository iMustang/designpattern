package decorator;

public class SortReportDecorator extends AbstractReportDecorator {
    public SortReportDecorator(ISchoolReport sr) {
        super(sr);
    }

    public void reportSort() {
        System.out.println("我的排名是5");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}