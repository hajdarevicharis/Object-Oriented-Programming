package org.example;
import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        //q3();
        q4();
    }

    public static void q3() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter number (Enter 0 to finish): ");
        while (true) {
            int read = Integer.parseInt(scanner.nextLine());
            if (read == 0) {
                break;
            }

            sum += read;
        }
        System.out.println("The sum of the entered numbers is: " + sum);
        scanner.close();
    }

    public static void q4() {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("Enter a: ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter b: ");
        b = Integer.parseInt(scanner.nextLine());
        System.out.println("First: " + a);
        System.out.println("Last: " + b);
        while (a < b) {
            if(a > b) {
                break;
            }
            System.out.println(a++);
        }

        scanner.close();
    }

    public static void q5() {

    }

}