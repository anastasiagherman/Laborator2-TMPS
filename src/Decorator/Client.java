package Decorator;

public class Client {
    public static void main(String[] args) {
        Cake cake = new ConcreteCake();

        cake.makeCake();

        System.out.println("Making a chocolate cake");
        CakeDecorator chocolateCake = new ChocolateDecorator(cake);
        chocolateCake.makeCake();

        System.out.println("Making a fruit cake");
        CakeDecorator fruitCake = new FruitDecorator(cake);
        fruitCake.makeCake();

        System.out.println("Making a caramel cake");
        CakeDecorator caramelCake = new CaramelDecorator(cake);
        caramelCake.makeCake();

        System.out.println("Making a chocolate cake with fruit");
        CakeDecorator chocolateFruitCake = new ChocolateDecorator(new FruitDecorator(cake));
        chocolateFruitCake.makeCake();
    }
}
