package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: Employee
 */
public class Employee {
    private String name;
    private String dept;
    private List<Employee> subordinates;

    public Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
        this.subordinates = new ArrayList<>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public List<Employee> getSubordinates() {
        return this.subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
