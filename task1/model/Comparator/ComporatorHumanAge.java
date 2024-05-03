package task1.model.Comparator;

import task1.model.Human;

import java.util.Comparator;

public class ComporatorHumanAge implements Comparator<Human>{
    @Override
    public int compare(Human o1, Human o2) {
        return Integer.compare(o1.getAge(),o2.getAge());
    }
}
