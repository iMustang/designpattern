package abstractfactory;

public class MediaHomeApplianceFactory implements HomeApplianceFactory{
    @Override
    public Airconditioner produceAirconditioner() {
        return new MediaAirconditioner();
    }

    @Override
    public Refrigerator produceRefrigerator() {
        return new MediaRefrigerator();
    }
}
