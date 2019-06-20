package responsibilitychain;

public class Boss extends ReviewPerson {
    private final String name = "老板";

    @Override
    void handle(String program) {
        if ("no bugs".equals(program)) {
            System.out.println(name + "：功能完成，可以上线了");
        } else {
            System.out.println("有bug，需要修改");
        }
    }
}
