package abstractfactory;

public class Main {
    public static void main(String[] args) {
        HomeApplianceFactory haierHomeApplianceFactory = new HaierHomeApplianceFactory();
        haierHomeApplianceFactory.produceAirconditioner().run();
        haierHomeApplianceFactory.produceRefrigerator().run();

        HomeApplianceFactory mediaHomeApplianceFactory = new MediaHomeApplianceFactory();
        mediaHomeApplianceFactory.produceAirconditioner().run();
        mediaHomeApplianceFactory.produceRefrigerator().run();
    }
}
