package visitor;

public class Main {
	public static void main(String[] args) {
		StaffContainer staffContainer = new StaffContainer();

		Engineer engineer = new Engineer("xMustang");
		engineer.setWorkTime(15);
		staffContainer.addStaff(engineer);

		Manager manager = new Manager("Horse");
		manager.setWorkTime(20);
		staffContainer.addStaff(manager);

		IDepartment personnelDepartment = new PersonnelDepartment();
		System.out.println("人事部统计所有员工工时");
		staffContainer.accept(personnelDepartment);

		System.out.println("------------------------");
		IDepartment accountingDepartment = new AccountingDepartment();
		System.out.println("财物部统计所有员工工资");
		staffContainer.accept(accountingDepartment);
	}
}
