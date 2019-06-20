package visitor;

/**
 * ConcreteElement：具体元素，实现抽象元素角色提供的 accept()，其方法体通常都是 visitor.visit(this) ，另外具体元素中可能还包含本身业务逻辑的相关操作。
 */
public class Engineer implements IStaff {
    private String staffName;
    private double workTime;

    public Engineer(String staffName) {
        this.staffName = staffName;
    }

    @Override
    public void accept(IDepartment department) {
        department.visit(this);
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public double getWorkTime() {
        return workTime;
    }

    public void setWorkTime(double workTime) {
        this.workTime = workTime;
    }
}
