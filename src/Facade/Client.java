package Facade;

import java.util.Scanner;

public class Client {
    private static int choice;

    public static void main(String[] args) {
        while(choice!=4){
            System.out.println("Chose an option: ");
            System.out.println(" 1. Apple.");
            System.out.println(" 2. Asus.");
            System.out.println(" 3. Lenovo.");
            System.out.println(" 4. Exit.");


            Scanner input = new Scanner(System.in);
            choice=input.nextInt();
            Facade sk=new Facade();

            switch (choice) {
                case 1:
                {
                    sk.appleSale();
                }
                break;
                case 2:
                {
                    sk.asusSale();
                }
                break;
                case 3:
                {
                    sk.lenovoSale();
                }
                break;
                default:
                {
                    System.out.println("Exit");
                }
                return;
            }

        }
    }
}
