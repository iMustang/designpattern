package bridge;

/**
 * Shape
 * 抽象化角色
 *
 * @author: xMustang
 * @since: 1.0
 */
public abstract class Shape {
    Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
