package observer.jdk;

public class Main {
    public static void main(String[] args) {
        Bell bell = new Bell();

        Teacher teacher = new Teacher();
        Student student = new Student();
        bell.addObserver(teacher);
        bell.addObserver(student);

        bell.belling(true);
    }
}
