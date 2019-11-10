package abstractfactory;

/**
 * 电器生产商
 */
public interface IHomeApplianceFactory {
    IAirconditioner produceAirconditioner();

    IRefrigerator produceRefrigerator();
}
