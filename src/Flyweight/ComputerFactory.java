package Flyweight;

import java.util.HashMap;

public class ComputerFactory {
    private HashMap<String, Computer> computerList = new HashMap<String, Computer>();
    public Computer getComputer(String computerType){
        Computer computer = computerList.get(computerType);
        if(computer == null){
            if(computerType == "Lenovo"){
                computer = new Lenovo();
                computerList.put("Lenovo", computer);
                System.out.println("A Lenovo computer was created and saved in memory");
            }else if (computerType == "Apple"){
                computer = new Apple();
                computerList.put("Apple", computer);
                System.out.println("An Apple computer was created and saved in memory");
            }else if (computerType == "Hp"){
                computer = new HP();
                computerList.put("Hp", computer);
                System.out.println("A Hp computer was created and saved in memory");
            }
        }
        return computer;
    }
}
