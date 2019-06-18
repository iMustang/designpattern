package abstractfactory;

public class MediaHomeApplianceFactory implements IHomeApplianceFactory {
    @Override
    public IAirconditioner produceAirconditioner() {
        return new MediaAirconditioner();
    }

    @Override
    public IRefrigerator produceRefrigerator() {
        return new MediaRefrigerator();
    }
}
