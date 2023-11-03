package Lab05;
import Lab05.Classes.*;
import Lab05.Classes.Boxes.Box;


public class lab05main {
    public static void main(String[] args) {

        Box box = new Box(10);

        box.add(new Book("haki","haki",4));
        box.add(new Book("haki2","haki2",2));
        box.add(new Book("haki3","haki3",2));

        box.add(new CD("haki","haki",2022));
        box.add(new CD("haki2","haki2",2021));
        box.add(new CD("haki3","haki3",2027));

        System.out.println(box);



    }



}
