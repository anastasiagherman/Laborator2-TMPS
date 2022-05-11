package Proxy;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName = input.next();
        DataBaseOperations dataBaseOperations = new ProxyDBOperation(userName);
        dataBaseOperations.view();
        dataBaseOperations.edit();
    }
}
