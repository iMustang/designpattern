package bridge;

/**
 * Circle
 * 扩展抽象化角色
 *
 * @author: xMustang
 * @since: 1.0
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        color.bepaint("圆形");
    }
}
