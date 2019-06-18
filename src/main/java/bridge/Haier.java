package bridge;

public class Haier extends BrandBridge {
    private final String name = "海尔";

    public Haier(IHomeAppliance homeAppliance) {
        super(homeAppliance);
    }

    @Override
    String description() {
        return this.name + homeAppliance.description();
    }
}
