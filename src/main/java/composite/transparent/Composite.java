package composite.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite
 * 树枝构件
 *
 * @author: xMustang
 * @since: 1.0
 */
public class Composite implements Component {
    private List<Component> children = new ArrayList<>();

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        for (Component c : children) {
            c.operation();
        }
    }
}
