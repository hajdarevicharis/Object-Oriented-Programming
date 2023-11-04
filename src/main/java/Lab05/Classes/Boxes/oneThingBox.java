package Lab05.Classes.Boxes;
import java.util.ArrayList;

public class oneThingBox extends Box{
    private ArrayList<Things> things = new ArrayList<>();


    public void add(Things thing) {
        if (this.things.size() < 1){
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
