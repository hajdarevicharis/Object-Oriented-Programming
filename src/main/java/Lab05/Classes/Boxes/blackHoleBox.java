package Lab05.Classes.Boxes;
import java.util.ArrayList;

public class blackHoleBox extends Box {
    private ArrayList<Things> things = new ArrayList<>();


    public void add(Things thing) {
        things.add(thing);
    }

    @Override
    public boolean isInTheBox(Things thing) {
        return false;
    }
}
