package task1;

import task1.familyTree.FamilyTree;
import task1.human.Gender;
import task1.human.Human;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //member1 - это родитель member2
        //member2 - это родитель member3 и member4

        FamilyTree tree = testTree();
        System.out.println(tree);
    }

    static FamilyTree testTree(){
        FamilyTree tree = new FamilyTree();

        Human oleg = new Human("Олег", Gender.Male, LocalDate.of(1975, 5, 5));
        Human irina = new Human("Ирина", Gender.Female, LocalDate.of(1975, 5, 31));
        tree.add(oleg);
        tree.add(irina);
        tree.setWedding(oleg, irina);

        Human darsha = new Human("Даша", Gender.Female, LocalDate.of(1999, 3, 8), oleg, irina);
        Human viktor = new Human("Виктор", Gender.Male, LocalDate.of(1999, 3, 8), oleg, irina);
        tree.add(darsha);
        tree.add(viktor);

        Human grandMother = new Human("Надежда", Gender.Female, LocalDate.of(1975, 5, 31));
        grandMother.addChild(irina);
        tree.add(grandMother);

        return tree;
    }
}
