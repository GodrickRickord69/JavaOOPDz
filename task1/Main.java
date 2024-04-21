package task1;

import task1.familyTree.FamilyTree;
import task1.Serializable.FileHandler;

public class Main {
    public static void main(String[] args) {

//        FamilyTree tree = testTree();
//        System.out.println(tree);
        FileHandler fileHandler = new FileHandler();
        String file = "JavaOOPDZ/task1/tree.txt";

        FamilyTree familyTree = new FamilyTree();

        familyTree = (FamilyTree) fileHandler.read(file);

        System.out.println(familyTree.getInfo());

        fileHandler.save(familyTree, file);
    }

//    static FamilyTree testTree(){
//        FamilyTree tree = new FamilyTree();
//
//        Human oleg = new Human("Олег", Gender.Male, LocalDate.of(1975, 5, 5));
//        Human irina = new Human("Ирина", Gender.Female, LocalDate.of(1975, 5, 31));
//        tree.add(oleg);
//        tree.add(irina);
//        tree.setWedding(oleg, irina);
//
//        Human darsha = new Human("Даша", Gender.Female, LocalDate.of(1999, 3, 8), oleg, irina);
//        Human viktor = new Human("Виктор", Gender.Male, LocalDate.of(1999, 3, 8), oleg, irina);
//        tree.add(darsha);
//        tree.add(viktor);
//
//        Human grandMother = new Human("Надежда", Gender.Female, LocalDate.of(1975, 5, 31));
//        grandMother.addChild(irina);
//        tree.add(grandMother);
//
//        return tree;
//    }
}
