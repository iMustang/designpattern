package simplefactroy;

public class Main {
    public static void main(String[] args) {
        // 使用简单工厂创建对象
        CakeFactory.produceCake("straberryCake").taste();
        CakeFactory.produceCake("chocolateCake").taste();

        // 不使用简单工厂，通过反射方式创建对象
        try {
            CakeFactory.produceCake(ChocolateCake.class).taste();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
