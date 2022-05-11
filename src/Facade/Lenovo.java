package Facade;

public class Lenovo implements ComputerShop{
    @Override
    public void compModel() {
        System.out.println("Lenovo IdeaPad 5 Pro");

    }

    @Override
    public void price() {
        System.out.println("18990 MDL");

    }
}
