package Lab06;

import java.util.ArrayList;

public class lab06main {
    public static void main(String[] args) {
        int[] values = {1,8,3,4,5,7,8};
        //System.out.println("smallest: " + smallest(values));
        //System.out.println("index of smallest: " + indexOfSmallest(values));
        System.out.println("index of smallest with starting index is: " + indexOfSmallestWithStartingIndex(values, 1));

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
}
