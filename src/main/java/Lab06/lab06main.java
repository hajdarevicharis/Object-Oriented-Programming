package Lab06;
import Lab06.classes.binarySearch;
import Lab06.LibrarySystem.Book;
import Lab06.HashMap.Dictionaryy;
import Lab06.Interface.TextUserInterface;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
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

        //nightSky nghtSky = new nightSky(20, 10, 0.2);

        //nightSky.printLine(3, 3);

        Book knjiga = new Book("Haki", "Haris", 2023);
        /*
        biblioteka.addBook(new Book("Hajdarevic","Haris",2023));
        biblioteka.addBook(new Book("Hajdarevic1","Haris2",2022));
        biblioteka.addBook(new Book("Hajdarevic2","Haris35534",2021));
        biblioteka.addBook(new Book("Hajdarevic2","Haris3",2021));
        biblioteka.addBook(new Book("Hajdarevic3","Haris4",2020));
        //biblioteka.printBooks();


        ArrayList<Book> results = biblioteka.searchByTitle("Hajdarevic2   ");
        for(Book book : results) {
            System.out.println(book);
        }

        Library Library = new Library();

        Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        ArrayList<Book> result = Library.searchByTitle("Cheese");
        for (Book book: result) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book: Library.searchByPublisher("Penguin Group  ")) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book: Library.searchByYear(1851)) {
            System.out.println(book);
        }


        HashMap<String, String> map = new HashMap<>();

        map.put("matti", "mage");
        map.put("haris", "haki");
        map.put("mikael", "mixu");

        PromissoryNote mattisNote = new PromissoryNote();
        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Mikael", 30);
        mattisNote.setLoan("Mikael", 20);


        System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
        System.out.println(mattisNote.howMuchIsTheDebt("Mikael"));


          */
        //HashMap<String, String> rjecnik = new HashMap<>();
        Dictionaryy rjecnik = new Dictionaryy();
        rjecnik.add("Pas", "Dog");
        rjecnik.add("Macka", "Cat");
        rjecnik.add("Haki", "Haris");

        Scanner reader = new Scanner(System.in);
        Dictionaryy dict = new Dictionaryy();

        TextUserInterface ui = new TextUserInterface(reader,dict);
        ui.start();

        Map<String, String> mapa = new HashMap<>();


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
