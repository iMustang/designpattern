package abstractfactory;

public class HaierHomeApplianceFactory implements HomeApplianceFactory {
    @Override
    public Airconditioner produceAirconditioner() {
        return new HaierAirconditioner();
    }

    @Override
    public Refrigerator produceRefrigerator() {
        return new HaierRefrigerator();
    }
}
