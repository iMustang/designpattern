package visitor;

/**
 * Element：抽象元素，声明一个接受操作accept()，访问者对象作为 accept() 的参数。
 */
public interface IStaff {
    void accept(IDepartment department);
}
