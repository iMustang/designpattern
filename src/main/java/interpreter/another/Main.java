package interpreter.another;

/**
 * Main
 *
 * @author: xMustang
 * @since: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Context bus = new Context();
        bus.freeRide("上海的老人");
        bus.freeRide("北京的儿童");
        bus.freeRide("南京的少年");
    }
}
