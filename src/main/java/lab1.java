package org.example;
import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {

        // first question
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        while(i < 3) {
            System.out.println("Enter a number: ");
            int userInput = Integer.parseInt(scanner.nextLine());
            i++;
            sum += userInput;
        }
        System.out.println("Your sum is: " + sum);
        scanner.close();

        // second question


    }
}