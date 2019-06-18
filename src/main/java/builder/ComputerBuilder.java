package builder;

public interface ComputerBuilder {
    void buildCpu(String cpu);

    void buildMemory(String memory);

    Computer build();
}
