package org.example;
import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {

        // first question
        Scanner scanner = new Scanner(System.in);
        String password = "haki123";
        System.out.println("Please enter a string; ");
        String userInput = scanner.nextLine();
        if(userInput.equals(password)) {
            System.out.println("You entered a correct password!");
            System.out.println("The secret is: ibueduba");
        } else {
            System.out.println("Wrong!");
        }
        scanner.close();

        // second question


    }
}