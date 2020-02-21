package prototype.manager;

import java.util.HashMap;
import java.util.Map;

/**
 * title: PrototypeManager
 *
 */
public class PrototypeManager {
    private Map<String, Shape> map = new HashMap<>();

    {
        map.put("circle", new Circle());
    }

    public void addShape(String key, Shape shape) {
        map.put(key, shape);
    }

    public Shape getShape(String key) throws CloneNotSupportedException {
        Shape shape = map.get(key);
        return (Shape) shape.clone();
    }
}
