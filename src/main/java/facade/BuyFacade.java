package facade;

public class BuyFacade {
    private OrderService orderService = new OrderService();
    private PayService payService = new PayService();
    private LogisticsService logisticsService = new LogisticsService();

    public void service() {
        orderService.service();
        payService.service();
        logisticsService.service();
    }
}
