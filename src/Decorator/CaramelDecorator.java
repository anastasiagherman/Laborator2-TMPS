package Decorator;

public class CaramelDecorator extends CakeDecorator{

    public CaramelDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public void makeCake() {
        System.out.println("Add caramel");
        super.makeCake();
    }
}
