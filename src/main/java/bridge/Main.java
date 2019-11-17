package bridge;

/**
 * Main
 *
 * @author: xMustang
 * @since: 1.0
 */
public class Main {
    public static void main(String[] args) {
        White white = new White();

        Square square = new Square();
        square.setColor(white);
        square.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.setColor(white);
        rectangle.draw();
    }
}
