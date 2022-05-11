package Decorator;

public class ChocolateDecorator extends CakeDecorator{
    public ChocolateDecorator(Cake cake) {
        super(cake);
    }

    @Override
    public void makeCake() {
        System.out.println("Add chocolate");
        super.makeCake();
    }


}
