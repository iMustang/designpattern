package builder;

public class ComputerDirector {
    private ComputerBuilder computerBuilder = new ConcreteComputerBuilder();

    public Computer build(String cpu, String memory) {
        computerBuilder.buildCpu(cpu);
        computerBuilder.buildMemory(memory);
        return computerBuilder.build();
    }
}
