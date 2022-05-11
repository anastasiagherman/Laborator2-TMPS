package Bridge;

public class Dell extends Computer{

    public Dell(OS opSystem) {
        super(opSystem);
    }

    @Override
    public void operatingSystem() {
        System.out.print("This is a Dell Computer with ");
        opSystem.operatingSystem();
        System.out.println(" operating system");
    }
}
