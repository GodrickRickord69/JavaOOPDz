package task1.model.Comparator;

import task1.model.Animal;
import java.util.Iterator;
import java.util.List;

public class AnimalIterator<T extends Animal> implements Iterator<T> {
    private int index;
    private List<T> humans;

    public AnimalIterator(List<T> humans) {
        this.humans = humans;
    }

    @Override
    public boolean hasNext() {
        return humans.size() > index;
    }

    @Override
    public T next() {
        return humans.get(index++);
    }
}
