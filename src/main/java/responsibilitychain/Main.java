package responsibilitychain;

public class Main {
    public static void main(String[] args) {
        Tester tester = new Tester();
        CTO cto = new CTO();
        Boss boss = new Boss();

        tester.setReviewPerson(cto);
        cto.setReviewPerson(boss);

        tester.handle("no bugs");
    }
}
