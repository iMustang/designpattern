package bridge;

public class Midea extends BrandBridge {
    private final String name = "美的";

    public Midea(HomeAppliance homeAppliance) {
        super(homeAppliance);
    }

    @Override
    String description() {
        return this.name + homeAppliance.description();
    }
}
