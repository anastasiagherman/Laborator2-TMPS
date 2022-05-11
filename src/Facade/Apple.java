package Facade;

public class Apple implements ComputerShop{
    @Override
    public void compModel() {
        System.out.println("Apple MacBook Pro 13");
    }

    @Override
    public void price() {
        System.out.println("39990 MDL");

    }
}
