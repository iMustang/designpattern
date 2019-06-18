package factorymethod;

public class BenzFactory implements ICarFactory {
    public ICar produceCar() {
        return new Benz();
    }
}
