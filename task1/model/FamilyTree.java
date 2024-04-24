package task1.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import task1.model.Comparator.AnimalIterator;

public class FamilyTree<T extends Animal> implements iterable<T>, Serializable {
    private List<T> familyTree;

    public FamilyTree(){
        familyTree = new ArrayList<>();
    }

    public void addFamilyTree(T human){
        if (!familyTree.contains(human)){
            familyTree.add(human);
            if(human.getMother() != null ){
                human.getMother().addChild(human);
            }
            if(human.getFather() != null){
                human.getFather().addChild(human);
            }
        }
    }

    public String toString() {
        String res = "В семье " + familyTree.size() + " человек:\n";
        for (int i = 0; i < familyTree.size(); i++) {
            res += (i + 1) + ") " + familyTree.get(i).toString() + "\n";
        }
        return res;
    }

    public T getByName(String humanName) {
        for (T human : familyTree) {
            if (human.getName().equalsIgnoreCase(humanName)) {
                return human;
            }
        }
        return null;
    }

    public List<T> getFamilyTree() {
        return familyTree;
    }

    public Iterator<T> iterator() {
        return new AnimalIterator<T>(familyTree);
        // return familyTree.iterator(); // простой способ достать итератор
    }

    public void saveObj(IO save) {
        save.save("FamilyTree.data", this);
    }
}
//public class FamilyTree implements Serializable {
//
//    private List<Human> humanList;
//
//    public FamilyTree() {
//        this(new ArrayList<>());
//    }
//
//    public FamilyTree(List<Human> humanList) {
//        this.humanList = humanList;
//    }
//
//    public boolean add(Human human){
//        if (human == null) {
//            return false;
//        }
//        if (!humanList.contains(human)){
//            humanList.add(human);
//            if (human.getFather() != null) human.getFather().addChild(human);
//            if (human.getMother() != null) human.getMother().addChild(human);
//            if (human.getSpousa() != null) human.getSpousa();
//            if (human.getSpouse() != null) human.getSpouse();
//
//
//            return true;
//        }
//        else return false;
//    }
//
//
//
//    public Human getByName(String name){
//        for (Human human: humanList){
//            if (human.getName().equals(name)) return human;
//        }
//        return null;
//    }
//
//
//    public String getInfo(){
//        StringBuilder sb = new StringBuilder();
//        sb.append("В дереве ");
//        sb.append(humanList.size());
//        sb.append(" объектов: \n");
//        int i =1;
//        for (Human human: humanList){
//            sb.append(i);
//            sb.append(' ');
//            sb.append(human.getInfo());
//            sb.append("\n");
//            i++;
//        }
//        return sb.toString();
//    }
//
//    public void sortByName(){
//        humanList.sort(new ComporatorHumanName());
//    }
//    public void sortByBirth(){
//        humanList.sort(new ComporatorHumanBirth());
//    }
//    public void sortByPlaceOfBirth(){
//        humanList.sort(new ComparatorHumanPlaceOfBirth());
//    }
//
//    public Iterator<Human> iterator(){
//        return new FamilyTreeIterator(humanList);
//    }
//}

