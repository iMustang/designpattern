package prototype.manager;

/**
 * title: Shape
 *
 */
public interface Shape extends Cloneable {
    Object clone() throws CloneNotSupportedException;

    void countArea();
}
