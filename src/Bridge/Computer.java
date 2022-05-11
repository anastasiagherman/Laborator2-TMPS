package Bridge;

public abstract class Computer {
    protected OS opSystem;

    public Computer(OS opSystem){
        this.opSystem = opSystem;
    }

    abstract public void operatingSystem();
}
