package visitor;

import lombok.Data;

/**
 * ConcreteElement：具体元素
 */
@Data
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
}
