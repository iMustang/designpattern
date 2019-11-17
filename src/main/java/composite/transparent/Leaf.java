package composite.transparent;

/**
 * Leaf
 * 树叶构件
 *
 * @author: xMustang
 * @since: 1.0
 */
public class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("树叶节点" + name + "：被访问");
    }
}
