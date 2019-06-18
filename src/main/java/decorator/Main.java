package decorator;

public class Main {
    public static void main(String[] args) {
        ISchoolReport sr = new FourthGradeSchoolReport();
        sr = new HighScoreReportDecorator(sr);
        sr = new SortReportDecorator(sr);
        sr.report();
    }
}
