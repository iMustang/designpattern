package bridge;

/**
 * @Title: Aircondition
 * @Description:
 * @Author: xMustang
 * @Version: 1.0
 * @create: 2019/6/18 15:44
 */
public class Aircondition implements HomeAppliance {
    private final String name = "空调";

    @Override
    public String description() {
        return this.name;
    }
}
