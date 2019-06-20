package visitor;

public class PersonnelDepartment implements IDepartment {
    @Override
    public void visit(Engineer engineer) {
        System.out.println(engineer.getStaffName() + "工程师，工作天数为：" + engineer.getWorkTime());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(manager.getStaffName() + "工程师，工作天数为：" + manager.getWorkTime());
    }
}
