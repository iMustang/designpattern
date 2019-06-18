package builder;

public class Main {
    public static void main(String[] args) {
        ComputerDirector computerDirector = new ComputerDirector();
        Computer computer = computerDirector.build("Intel", "Kinston");
        System.out.println(computer);
    }
}
