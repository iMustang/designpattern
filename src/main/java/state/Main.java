package state;

public class Main {
    public static void main(String[] args) {
        ScoreContext scoreContext = new ScoreContext();
        scoreContext.add(30);
        scoreContext.add(40);
        scoreContext.add(20);
        scoreContext.add(-10);
        scoreContext.add(-30);
    }
}
