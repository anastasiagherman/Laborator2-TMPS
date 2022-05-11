package Bridge;

import java.sql.SQLOutput;

public class HP extends Computer{

    public HP(OS opSystem) {
        super(opSystem);
    }

    @Override
    public void operatingSystem() {
        System.out.print("This is a HP Computer with ");
        opSystem.operatingSystem();
        System.out.println(" operating system");
    }
}
