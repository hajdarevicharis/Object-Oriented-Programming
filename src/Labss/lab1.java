package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "haki123";
        System.out.println("Please enter a string; ");
        String userInput = scanner.nextLine();
            if(userInput == password) {
                System.out.println("You entered: " + userInput);
            } else {
                System.out.println("Wrong!");
            }
        scanner.close();
        System.out.println("You entered: " + userInput);
    }
}