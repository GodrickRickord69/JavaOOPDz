package task1.familyTree;

import task1.human.Comparator.ComporatorHumanBirth;
import task1.human.Comparator.ComporatorHumanName;
import task1.human.Comparator.ComparatorHumanPlaceOfBirth;
import task1.human.Human;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class FamilyTree implements Serializable {
//    private long countPeople;
    private List<Human> humanList;

    public FamilyTree() {
        this(new ArrayList<>());
    }

    public FamilyTree(List<Human> humanList) {
        this.humanList = humanList;
    }

    public boolean add(Human human){
        if (human == null) {
            return false;
        }
        if (!humanList.contains(human)){
            humanList.add(human);
            if (human.getFather() != null) human.getFather().addChild(human);
            if (human.getMother() != null) human.getMother().addChild(human);
            if (human.getSpousa() != null) human.getSpousa();
            if (human.getSpouse() != null) human.getSpouse();
//            human.setId(countPeople++);
//
//            addToParents(human);
//            addToChildren(human);

            return true;
        }
        else return false;
    }

//    private void addToParents(Human human){
//        for (Human parent: human.getParents()){
//            parent.addChild(human);
//        }
//    }
//
//    private void addToChildren(Human human){
//        for (Human child: human.getChildren()){
//            child.addParent(human);
//        }
//    }
//
//    public List<Human> getSiblings(int id){
//        Human human = getById(id);
//        if (human == null){
//            return null;
//        }
//        List<Human> res = new ArrayList<>();
//        for (Human parent: human.getParents()){
//            for (Human child: parent.getChildren()){
//                if (!child.equals(human)){
//                    res.add(child);
//                }
//            }
//        }
//        return res;
//    }

    public Human getByName(String name){
        for (Human human: humanList){
            if (human.getName().equals(name)) return human;
        }
        return null;
    }
//    public List<Human> getByName(String name){
//        List<Human> res = new ArrayList<>();
//        for (Human human: humanList){
//            if (human.getName().equals(name)){
//                res.add(human);
//            }
//        }
//        return res;
//    }



//    public boolean setWedding(long humanId1, long humanId2){
//        if (checkId(humanId1) && checkId(humanId2)){
//            Human human1 = getById(humanId1);
//            Human human2 = getById(humanId2);
//            return setWedding(human1, human2);
//        }
//        return false;
//    }
//
//    public boolean setWedding(Human human1, Human human2){
//        if (human1.getSpouse() == null && human2.getSpouse() == null){
//            human1.setSpouse(human2);
//            human2.setSpouse(human1);
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public boolean setDivorce(long humanId1, long humanId2){
//        if (checkId(humanId1) && checkId(humanId2)){
//            Human human1 = getById(humanId1);
//            Human human2 = getById(humanId2);
//            return setDivorce(human1, human2);
//        }
//        return false;
//    }
//
//    public boolean setDivorce(Human human1, Human human2){
//        if (human1.getSpouse() != null && human2.getSpouse() != null){
//            human1.setSpouse(null);
//            human2.setSpouse(null);
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public boolean remove(long humansId){
//        if (checkId(humansId)){
//            Human human = getById(humansId);
//            return humanList.remove(human);
//        }
//        return false;
//    }
//
//    private boolean checkId(long id) {
//        return id < countPeople && id >= 0;
//    }
//
//    public Human getById(long id){
//        if (checkId(id)){
//            for (Human human: humanList){
//                if (human.getId() == id){
//                    return human;
//                }
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public String toString() {
//        return getInfo();
//    }

    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("В дереве ");
        sb.append(humanList.size());
        sb.append(" объектов: \n");
        int i =1;
        for (Human human: humanList){
            sb.append(i);
            sb.append(' ');
            sb.append(human.getInfo());
            sb.append("\n");
            i++;
        }
        return sb.toString();
    }

    public void sortByName(){
        humanList.sort(new ComporatorHumanName());
    }
    public void sortByBirth(){
        humanList.sort(new ComporatorHumanBirth());
    }
    public void sortByPlaceOfBirth(){
        humanList.sort(new ComparatorHumanPlaceOfBirth());
    }

    public Iterator<Human> iterator(){
        return new FamilyTreeIterator(humanList);
    }
}

