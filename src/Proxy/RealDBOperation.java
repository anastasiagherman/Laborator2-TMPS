package Proxy;

public class RealDBOperation implements DataBaseOperations{
    @Override
    public void view() {
        System.out.println("Performing view operation");
    }

    @Override
    public void edit() {
        System.out.println("Performing edit operation");
    }
}
