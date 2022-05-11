package Facade;

public class Asus implements ComputerShop{
    @Override
    public void compModel() {
        System.out.println("Asus Zenbook 14X UX5401EA OLED");
    }

    @Override
    public void price() {
        System.out.println("30690 MDL");
    }
}
