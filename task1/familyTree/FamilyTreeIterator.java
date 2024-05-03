package task1.familyTree;

import task1.model.Human;

import java.util.Iterator;
import java.util.List;

public class FamilyTreeIterator implements Iterator<Human> {
    private List<Human> list;
    private int idex;

    public FamilyTreeIterator(List<Human> list){
        this.list = list;
        idex = 0;
    }
    public boolean hasNext(){
        return idex < list.size();
    }

    public Human next(){
        return list.get(idex++);
    }
}
