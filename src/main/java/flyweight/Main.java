package flyweight;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        IShape red = shapeFactory.getShape("red");
        IShape blue = shapeFactory.getShape("blue");
        IShape anotherRed = shapeFactory.getShape("red");

        System.out.println(red);
        System.out.println(anotherRed);
        System.out.println(blue);
    }
}
