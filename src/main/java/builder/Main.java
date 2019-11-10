package builder;

public class Main {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();
        Computer computer = director.build("Intel", "Kinston");
        System.out.println(computer);
    }
}
