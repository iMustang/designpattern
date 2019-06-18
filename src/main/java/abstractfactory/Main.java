package abstractfactory;

public class Main {
    public static void main(String[] args) {
        IHomeApplianceFactory haierHomeApplianceFactory = new HaierHomeApplianceFactory();
        haierHomeApplianceFactory.produceAirconditioner().run();
        haierHomeApplianceFactory.produceRefrigerator().run();

        IHomeApplianceFactory mediaHomeApplianceFactory = new MediaHomeApplianceFactory();
        mediaHomeApplianceFactory.produceAirconditioner().run();
        mediaHomeApplianceFactory.produceRefrigerator().run();
    }
}
