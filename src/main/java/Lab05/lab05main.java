package Lab05;
import Lab05.Classes.*;
import Lab05.Classes.Boxes.*;


public class lab05main {
    public static void main(String[] args) {
        Box box1 = new maxWeightBox(10);
        Box box2 = new oneThingBox();
        Box box3 = new blackHoleBox();
        Box box4 = new maxWeightBox(5);

        Things thing1 = new Things("Thing1", 3.0);
        Things thing2 = new Things("Thing2", 2.5);
        Things thing3 = new Things("Thing3", 1.0);
        box1.add(thing1);
        box2.add(thing2);
        box3.add(thing3);
        box4.add(thing1);

        if (box1 instanceof maxWeightBox) {
            maxWeightBox maxWeightBox1 = (maxWeightBox) box1;
            System.out.println("Downcasted to MaxWeightBox: " + maxWeightBox1.isInTheBox(thing1));
        }

        if (box2 instanceof oneThingBox) {
            oneThingBox oneThingBox = (oneThingBox) box2;
            System.out.println("Downcasted to OneThingBox: " + oneThingBox.isInTheBox(thing2));
        }

        if (box3 instanceof blackHoleBox) {
            blackHoleBox blackHoleBox = (blackHoleBox) box3;
            System.out.println("Downcasted to BlackHoleBox: " + blackHoleBox.isInTheBox(thing3));
        }

        if (box4 instanceof maxWeightBox) {
            maxWeightBox maxWeightBox2 = (maxWeightBox) box4;
            System.out.println("Downcasted to MaxWeightBox: " + maxWeightBox2.isInTheBox(thing1));
        }
    }



}
