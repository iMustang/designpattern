package composite.transparent;

/**
 * Main
 *
 * @author: xMustang
 * @since: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Composite branch1 = new Composite();
        Composite branch2 = new Composite();

        Leaf leaf1 = new Leaf("1");
        Leaf leaf2 = new Leaf("2");
        Leaf leaf3 = new Leaf("3");

        branch1.add(leaf1);
        branch2.add(leaf2);
        branch2.add(leaf3);
        branch1.add(branch2);

        branch1.operation();
    }
}
