package abstractfactory;

public class HaierHomeApplianceFactory implements IHomeApplianceFactory {
    @Override
    public IAirconditioner produceAirconditioner() {
        return new HaierAirconditioner();
    }

    @Override
    public IRefrigerator produceRefrigerator() {
        return new HaierRefrigerator();
    }
}
