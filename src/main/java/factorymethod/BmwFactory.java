package factorymethod;

public class BmwFactory implements ICarFactory {
    public ICar produceCar() {
        return new Bmw();
    }
}
