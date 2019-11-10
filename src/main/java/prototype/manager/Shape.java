package prototype.manager;

/**
 * title: Shape
 * description:
 */
public interface Shape extends Cloneable {
    Object clone() throws CloneNotSupportedException;

    void countArea();
}
