package composite;

public class Main {
    public static void main(String[] args) {
        Employee ceo = new Employee("John", "CEO");
        Employee salesHeader = new Employee("Robert", "SalesHeader");
        Employee marketingHeader = new Employee("Michel", "MarketingHeader");
        Employee salesE1 = new Employee("Laura", "Sales");
        Employee salesE2 = new Employee("Bob", "Sales");
        Employee marketE1 = new Employee("Rob", "Marketing");

        salesHeader.add(salesE1);
        salesHeader.add(salesE2);
        marketingHeader.add(marketE1);
        ceo.add(salesHeader);
        ceo.add(marketingHeader);

        System.out.println(ceo);
        for (Employee headEmployee : ceo.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
