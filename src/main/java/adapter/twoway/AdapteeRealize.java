package adapter.twoway;

/**
 * title: AdapteeRealize
 * description:
 */
public class AdapteeRealize implements TwoWayAdaptee {
    @Override
    public void specificRequest() {
        System.out.println("适配者代码被调用");
    }
}
