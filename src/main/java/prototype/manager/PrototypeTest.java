package prototype.manager;

/**
 * title: PrototypeTest
 *
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeManager pm = new PrototypeManager();
        Circle circle = (Circle) pm.getShape("circle");
        circle.setR(3);
        circle.countArea();

        Circle circle1 = (Circle) pm.getShape("circle");
        circle1.setR(5);
        circle1.countArea();

        System.out.println(circle == circle1);
    }
}
