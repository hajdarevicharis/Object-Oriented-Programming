package Lab06;
import Lab06.classes.binarySearch;
import Lab06.classes.nightSky;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class lab06main {
    public static void main(String[] args) {
        int[] values = {1,8,3,4,5,7,8};
        binarySearch binSrch = new binarySearch();



        //System.out.println("smallest: " + smallest(values));
        //System.out.println("index of smallest: " + indexOfSmallest(values));
        //System.out.println("index of smallest with starting index is: " + indexOfSmallestWithStartingIndex(values, 1));
        //System.out.println("original array is: ");
        //for (int num : values) {
        //    System.out.print(num + " ");
        //}
        //System.out.println();
        //System.out.println("swapped array is: ");
        //swap(values, 1, 4);
        //for (int num : values) {
        //    System.out.print(num + " ");
        //}
        /*
        Scanner reader = new Scanner(System.in);

        System.out.println("array: " + Arrays.toString(values));
        System.out.println();

        System.out.println("Enter searched number: ");
        String searchedValue = reader.nextLine();
        int searchedValueInt = Integer.parseInt(searchedValue);
        System.out.println();

        boolean binSrchBool = binSrch.binarySearchMethod(values, searchedValueInt);


        System.out.println("Your searched number is: " + searchedValue);
        if (binSrchBool) {
            System.out.println(searchedValue + " is in the array");
        } else {
            System.out.println("Your " + searchedValue + " is not in the array");
        }

         */

        //printElegantly(values);

        nightSky nghtSky = new nightSky(20, 10, 0.2);

        nghtSky.printLine(20);
    }
    public static int smallest(int[] array) {
        int smallest = 999;
        for(int i = 0; i <= array.length - 1; i++) {
            if(array[i] <= smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = 999;
        int index = 0;
        for(int i = 0; i <= array.length - 1; i++) {
            if(array[i] <= smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestWithStartingIndex(int[] array, int index) {
        int smallest = 999;
        for (int i = index; i <= array.length - 1; i++) {
            if(array[i] <= smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
// 0 5 8
    public static void swap(int[] array, int index1, int index2) {
        int temp;
        for (int i = 0; i <= array.length - 1; i++) {
            temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
    }

    public static int printElegantly(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println(array[array.length - 1]);

        return 0;

    }
}
