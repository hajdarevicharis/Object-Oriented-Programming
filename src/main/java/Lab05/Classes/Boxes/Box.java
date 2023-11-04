package Lab05.Classes.Boxes;

import Lab05.Classes.toBeStored;

import java.awt.color.ICC_ColorSpace;
import java.util.ArrayList;
import java.util.Collection;

public abstract class Box {
    public abstract void add(Things thing);

    public void add(Collection<Things> things) {
        for(Things thing : things) {
            add(thing);
        }
    }
    public abstract boolean isInTheBox(Things thing);
}
