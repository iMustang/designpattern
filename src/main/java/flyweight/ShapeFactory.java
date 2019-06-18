package flyweight;

import java.util.HashMap;

/**
 * FlyWeightFactory：封装共享对象工厂。
 */
public class ShapeFactory {
    private HashMap<String, IShape> map = new HashMap<>();

    public IShape getShape(String color) {
        IShape shape = map.get(color);
        if (shape == null) {
            shape = new Circle(color);
            map.put(color, shape);
        }
        return shape;
    }
}
