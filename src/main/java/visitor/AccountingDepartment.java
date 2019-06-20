package visitor;

/**
 * ConcreteVisitor：具体访问者，实现抽象访问者角色中声明的各个访问操作，确定访问者访问一个元素时该做什么。
 */
public class AccountingDepartment implements IDepartment {
    private static final double ENGINER_DAILY_SALARY = 1500;
    private static final double MANAGER_DAILY_SALARY = 1000;

    @Override
    public void visit(Engineer engineer) {
        System.out.println(engineer.getStaffName() + "工程师，月薪为：" + ENGINER_DAILY_SALARY * engineer.getWorkTime());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(manager.getStaffName() + "经理，月薪为：" + MANAGER_DAILY_SALARY * manager.getWorkTime());
    }
}
