package decorator;

public class HighScoreReportDecorator extends AbstractReportDecorator {
    public HighScoreReportDecorator(ISchoolReport sr) {
        super(sr);
    }

    public void reportHighScore() {
        System.out.println("最高分是80");
    }

    @Override
    public void report() {
        super.report();
        this.reportHighScore();
    }
}
