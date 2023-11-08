package Lab06;

import java.util.ArrayList;

public class lab06main {
    public static void main(String[] args) {
        int[] values = {1,8,3,4,5,2,7,8,3};
        //System.out.println("smallest: " + smallest(values));
        System.out.println("index of smallest: " + indexOfSmallest(values));

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
}
