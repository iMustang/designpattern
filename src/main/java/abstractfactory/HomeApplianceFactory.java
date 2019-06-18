package abstractfactory;

public interface HomeApplianceFactory {
    Airconditioner produceAirconditioner();

    Refrigerator produceRefrigerator();
}
