package Lab06.classes;

public class binarySearch {
    public static boolean binarySearchMethod(int[] array, int searchedValue) {
        if (array != null) {
            for (int i = 0; i <= array.length - 1; i++) {
                if (array[i] == searchedValue) {
                    return true;
                }
            }
        }
        return false;
}
}
