package task1.model.Comparator;

import task1.model.Human;
import java.util.Comparator;

public class ComparatorHumanPlaceOfBirth implements Comparator<Human>{
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getPlaceOfBirth().compareTo(o2.getPlaceOfBirth());
    }
}