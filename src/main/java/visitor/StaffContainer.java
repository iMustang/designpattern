package visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Object Structure：对象结构，包含元素角色的容器，提供让访问者遍历容器中的所有元素的方法。
 */
public class StaffContainer {
    private List<IStaff> list = new ArrayList<>();

    public void addStaff(IStaff staff) {
        list.add(staff);
    }

    public void accept(IDepartment department) {
        Iterator<IStaff> iterator = list.iterator();
        while (iterator.hasNext()) {
            IStaff staff = iterator.next();
            staff.accept(department);
        }
    }
}
