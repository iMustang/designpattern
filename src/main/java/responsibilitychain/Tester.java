package responsibilitychain;

/**
 * Concrete Handler：具体处理者，实现抽象处理者的处理方法，判断能否处理本次请求，如果可以处理请求则处理，否则将该请求转给它的后继者。
 */
public class Tester extends ReviewPerson {
    private final String name = "测试人员";

    @Override
    void handle(String program) {
        if ("no bugs".equals(program)) {
            System.out.println(name + "：没问题，提交给技术总监");
            getReviewPerson().handle(program);
        } else {
            System.out.println("有bug，需要修改");
        }
    }
}
