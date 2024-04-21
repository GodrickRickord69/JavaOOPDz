package task1.human.Comparator;

import task1.human.Human;

import java.util.Comparator;

public class ComporatorHumanBirth implements Comparator<Human>{
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getBirthDate().compareTo(o2.getBirthDate());
    }
}
