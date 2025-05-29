package patterns.structural.facade;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        System.out.println("Starting computer...");
        cpu.freeze();
        memory.load();
        hardDrive.read();
        cpu.jump();
        cpu.execute();
    }

    private class CPU {
        public void freeze() { System.out.println("CPU: Freezing"); }
        public void jump() { System.out.println("CPU: Jumping to start"); }
        public void execute() { System.out.println("CPU: Executing"); }
    }

    private class Memory {
        public void load() { System.out.println("Memory: Loading"); }
    }

    private class HardDrive {
        public void read() { System.out.println("HardDrive: Reading"); }
    }
}
