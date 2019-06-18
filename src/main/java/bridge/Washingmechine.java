package bridge;

/**
 * @Title: Washingmechine
 * @Description:
 * @Author: xMustang
 * @Version: 1.0
 * @create: 2019/6/18 15:45
 */
public class Washingmechine implements IHomeAppliance {
    private final String name = "洗衣机";

    @Override
    public String description() {
        return this.name;
    }
}
