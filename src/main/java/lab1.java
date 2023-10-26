package org.example;
import javax.swing.text.Style;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class lab1 {
    public static void printEvenOdd(int[] numbers) {
        int even = 0;
        int odd = 0;
        int zero = 0;

        for (int i = 0; i <= numbers.length-1; i++) {
            if (numbers[i] % 2 == 0) {
                even++;
            }
            if (numbers[i] % 2 != 0) {
                odd++;
            }
            if(numbers[i] == 0) {
                zero++;
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
        System.out.println("Zero's: " + zero);
    }

    public static void printWordsFromSentence(String sentence) {

        String[] words = sentence.split(" ");

        for (String word : words) {
            System.out.println(word);
        }
    }
    public static void pyramid(int rows) {
        for(int i = 0; i <= rows; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
                if(j == i) {
                    System.out.println(" ");
                }
            }
        }
    }

    public static void complexPyramid(int rows) {
        for (int i = 1; i <= rows*2; i+=2) {
            for (int j = 0; j < ((rows*2)-i)/2; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static int fibonacci(int num) {
        if(num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        } else {
            return fibonacci(num-1) + fibonacci(num-2);
        }
    }

    //0 1 1 2 3 5


    public static void main(String[] args) {
        //q1();
        //q2();
        //q3();
        //q4();
        //q5();
        //q6();
        //q7(5);
        //q7(9);
        //q8(5);
        //q9(5);
        //q10(5);
        //q11(5);
        //q12();
        //addNumbersToList(5,6,3);
        //printEvenOdd(new int[]{5,4,3,5,7,8,9,0});
        //String sentence = "this is a new sentence";
        //printWordsFromSentence(sentence);
        //pyramid(5);
        //complexPyramid(10);
        System.out.println(fibonacci(10));
    }

    public static void q1() {
        Scanner scanner = new Scanner(System.in);
        String pwd;
        while(true) {
            System.out.print("Guess: ");
            pwd = scanner.nextLine();
            if(pwd.equals("hajdarevicharis")) {
                System.out.println("Correct!");
                break;
            }
            else {
                System.out.println("Wrong!");
            }
        }
    }

    public static void q2() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;
        int i = 0;
        while (i < 3) {
            System.out.print("Input number: ");
            System.out.print("Enter new number: ");
            num = scanner.nextInt();
            sum += num;
            i++;
        }
        System.out.println("Sum: " + sum);
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

    public static void q6() {
        Scanner scanner = new Scanner(System.in);

        String text = "International Burch University";
        System.out.println("Enter how many times do you want to repeat this text: ");
        int n = Integer.parseInt(scanner.nextLine());
        int i = 0;
        while(i < n) {
            System.out.println(text);
            i++;
        }
        scanner.close();
    }

    public static void q7(int amount) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < amount; i++) {
            System.out.print("*");
        }

        scanner.close();
    }
    public static void q8(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void q9(int n) {
        for(int i = n; i >= 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void q10(int n) {
        for(int i = 1; i <= n + 1; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void q11(int n) {
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void q12() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNum = random.nextInt(100) + 1;
        int guesses = 0;
        while (true) {
            System.out.print("Guess: ");
            int guess = scanner.nextInt();
            guesses++;
            if(guess == randomNum) {
                System.out.println("Congratulations!");
                break;
            }
            if(guess > randomNum) {
                System.out.println("Your number is smaller, number of guesses: " + guesses);
            }
            if(guess < randomNum) {
                System.out.println("Your number is greater, number of guesses: " + guesses);
            }
        }
    }


}