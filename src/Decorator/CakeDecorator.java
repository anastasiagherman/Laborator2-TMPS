package Decorator;

public abstract class CakeDecorator implements Cake{

    public Cake cake;

    public CakeDecorator(Cake cake){
        this.cake= cake;
    }

    @Override
    public void makeCake() {
        this.cake.makeCake();

    }
}
