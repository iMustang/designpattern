package simplefactroy;

public class Main {
    public static void main(String[] args) {
        CakeFactory.produceCake("durianCake").taste();
        CakeFactory.produceCake("straberryCake").taste();
        CakeFactory.produceCake("chocolateCake").taste();

        // 通过反射方式创建对象
        try {
            CakeFactory.produceCake(DurianCake.class).taste();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
