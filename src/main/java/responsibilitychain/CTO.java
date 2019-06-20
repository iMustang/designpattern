package responsibilitychain;

public class CTO extends ReviewPerson {
    private final String name = "技术总监";

    @Override
    void handle(String program) {
        if ("no bugs".equals(program)) {
            System.out.println(name + "：没问题，提交给老板");
            getReviewPerson().handle(program);
        } else {
            System.out.println("有bug，需要修改");
        }
    }
}
