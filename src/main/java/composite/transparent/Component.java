package composite.transparent;

/**
 * Component
 * 抽象构件角色
 *
 * @author: xMustang
 * @since: 1.0
 */
public interface Component {
    void add(Component c);
    void remove(Component c);
    Component getChild(int i);
    void operation();
}
