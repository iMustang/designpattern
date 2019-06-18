package bridge;

public class Main {
    public static void main(String[] args) {
        BrandBridge midea = new Midea(new Aircondition());
        System.out.println(midea.description());

        BrandBridge midea1 = new Midea(new Washingmechine());
        System.out.println(midea1.description());

        BrandBridge haier = new Haier(new Aircondition());
        System.out.println(haier.description());

        BrandBridge gree = new Gree(new Aircondition());
        System.out.println(gree.description());
    }
}
