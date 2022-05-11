package Flyweight;

import java.util.Arrays;
import java.util.List;

public class Client {
    static ComputerFactory compFactory = new ComputerFactory();

    public static void main(String[] args) {
        String[] strArray = {"Black", "Blue", "White", "Red"};
        List<String> compColors = Arrays.asList(strArray);
        for(String val : compColors){
            Computer computer1 = compFactory.getComputer("Hp");
            System.out.println("A " + val + " Hp computer was created");
        }
        for(String val : compColors){
            Computer computer1 = compFactory.getComputer("Apple");
            System.out.println("A " + val + " Apple computer was created");
        }
        for(String val : compColors){
            Computer computer1 = compFactory.getComputer("Lenovo");
            System.out.println("A " + val + " Lenovo computer was created");
        }

    }
}
