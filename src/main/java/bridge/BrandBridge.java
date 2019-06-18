package bridge;

/**
 * @Title: BrandBridge
 * @Description:
 * @Author: xMustang
 * @Version: 1.0
 * @create: 2019/6/18 15:46
 */
public abstract class BrandBridge {
    protected IHomeAppliance homeAppliance;

    public BrandBridge(IHomeAppliance homeAppliance) {
        this.homeAppliance = homeAppliance;
    }

    abstract String description();
}
