package Facade;

public class Facade {
    private ComputerShop lenovo;
    private ComputerShop asus;
    private ComputerShop apple;

    public Facade(){
        lenovo = new Lenovo();
        asus = new Asus();
        apple = new Apple();
    }
    public void lenovoSale(){
        lenovo.compModel();
        lenovo.price();
    }
    public void appleSale(){
        apple.compModel();
        apple.price();
    }
    public void asusSale(){
        asus.compModel();
        asus.price();
    }
}
