package bridge;

/**
 * @Title: Gree
 * @Description:
 * @Author: xMustang
 * @Version: 1.0
 * @create: 2019/6/18 15:59
 */
public class Gree extends BrandBridge {
    private final String name = "格力";

    public Gree(IHomeAppliance homeAppliance) {
        super(homeAppliance);
    }

    @Override
    String description() {
        return this.name + homeAppliance.description();
    }
}
