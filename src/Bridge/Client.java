package Bridge;

public class Client {
    public static void main(String[] args) {
        Computer windowsHP = new HP(new WindowsOS());
        windowsHP.operatingSystem();

        Computer linuxDell = new Dell(new LinuxOS());
        linuxDell.operatingSystem();

    }
}
