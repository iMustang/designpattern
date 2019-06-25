package adapter.forobj;

/**
 * 对象适配器模式
 *
 * 使用一个已经存在的类，数据和行为都正确，但接口不符时，考虑用适配器。适配器模式主要应用于希望复用一些现存的类，但是接口又与复用环境要求不一致
 */
public class Main {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.request();
    }
    /**
     * 项目初期，不应该用适配器模式，应该考虑重构统一接口。
     * 考虑使用第三方开发组件，这个组件的接口与自己的系统不相同时，在项目初期，也可以用适配器模式。
     */
}
