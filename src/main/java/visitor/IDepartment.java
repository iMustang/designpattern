package visitor;

/**
 * Visitor:抽象访问者，为每个具体元素类对应一个访问操作 visit() ，参数类型标识被访问的具体元素。
 */
public interface IDepartment {
    void visit(Engineer engineer);

    void visit(Manager manager);
}
