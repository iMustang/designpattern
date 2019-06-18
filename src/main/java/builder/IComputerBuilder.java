package builder;

public interface IComputerBuilder {
    void buildCpu(String cpu);

    void buildMemory(String memory);

    Computer build();
}
