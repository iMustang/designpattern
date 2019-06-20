package visitor;

public class Manager implements IStaff {
    private String staffName;
    private double workTime;
    public Manager(String staffName) {
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
