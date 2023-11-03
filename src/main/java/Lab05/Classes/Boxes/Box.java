package Lab05.Classes.Boxes;

import Lab05.Classes.toBeStored;

import java.awt.color.ICC_ColorSpace;
import java.util.ArrayList;
import java.util.Collection;

public class Box implements toBeStored {
    double maxWeight;
    double currentWeight;
    private ArrayList<toBeStored> things;
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
        this.things = new ArrayList<>();
    }

    public void add(toBeStored item) {
        if(currentWeight + item.weight() <= maxWeight) {
            things.add(item);
            currentWeight += item.weight();
        } else {
            System.out.println("Exceeds max weight");
        }
    }

    public double weight() {
        return currentWeight;
    }

    public String toString() {
        return "Box: " + things.size() + " things, total weight: " + currentWeight + "kg";
    }

}
