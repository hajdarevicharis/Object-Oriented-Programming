package Lab05.Classes.Boxes;

import java.util.ArrayList;

public class maxWeightBox extends Box {
    private ArrayList<Things> things = new ArrayList<>();
    private int maxWeight;
    private int weightInBox;

    public maxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.weightInBox = 0;
    }

    @Override
    public void add(Things thing) {
        if (this.weightInBox < this.maxWeight) {
            this.weightInBox += thing.weight();
            things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Things thing) {
        for (Things t : things){
            if (t.getName().equals(thing.getName())){
                return true;
            }
        }
        return false;
    }

}
