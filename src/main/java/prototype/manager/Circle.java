package prototype.manager;

import lombok.Data;

/**
 * title: Circle
 * description:
 */
@Data
public class Circle implements Shape {
    private double r;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void countArea() {
        System.out.println("圆的面积为：" + Math.PI * r * r);
    }
}
