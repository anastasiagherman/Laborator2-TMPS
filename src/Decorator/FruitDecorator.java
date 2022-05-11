package Decorator;

public class FruitDecorator extends CakeDecorator {

    public FruitDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public void makeCake() {
        System.out.println("Add some fruit");
        super.makeCake();
    }
}
