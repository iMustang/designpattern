package flyweight;

/**
 * ConcreteFlyWeight：共享对象的具体实现。
 */
public class Circle implements IShape {
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("这是一个" + color + "颜色的circle");
    }
}
