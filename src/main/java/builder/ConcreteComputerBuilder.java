package builder;

public class ConcreteComputerBuilder implements ComputerBuilder {
    private Computer computer = new Computer();

    @Override
    public void buildCpu(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    public void buildMemory(String memory) {
        computer.setMemory(memory);
    }

    @Override
    public Computer build() {
        return computer;
    }
}
