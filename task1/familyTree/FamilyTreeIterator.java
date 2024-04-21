package task1.familyTree;

import task1.human.Human;

import java.util.Iterator;
import java.util.List;

public class FamilyTreeIterator implements Iterator<Human> {
    private List<Human> list;
    private int id;

    public FamilyTreeIterator(List<Human> list){
        this.list = list;
        id = 0;
    }
    public boolean hasNext(){
        return id < list.size();
    }

    public Human next(){
        return list.get(id++);
    }
}
