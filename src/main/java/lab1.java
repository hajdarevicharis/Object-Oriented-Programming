package org.example;
import javax.swing.text.Style;
import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        //q3();
        //q4();
        q5();
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = Integer.parseInt(scanner.nextLine());
        int i = 0;
        int sum = 0;

        while (i <= n) {
            int result = (int)Math.pow(2,i);
            sum += result;
            i++;
        }

        System.out.println("Your sum is: " + sum);

        scanner.close();
    }

}