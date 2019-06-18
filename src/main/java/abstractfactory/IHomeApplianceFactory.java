package abstractfactory;

public interface IHomeApplianceFactory {
    IAirconditioner produceAirconditioner();

    IRefrigerator produceRefrigerator();
}
