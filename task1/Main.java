package task1;

import task1.model.Comparator.ComparatorHumanPlaceOfBirth;
import task1.model.Comparator.ComporatorHumanAge;
import task1.model.FamilyTree;
import task1.model.Human;
import task1.model.Comparator.ComporatorHumanName;
import task1.model.IO;
import task1.present.Presenter;
import task1.ui.Console;
import task1.ui.View;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FamilyTree<Human> familyTree = new FamilyTree<>();


        familyTree.addFamilyTree(new Human("Oleg", "Male", 48, "Moscow", null, null));
        familyTree.addFamilyTree(new Human("Irina", "Female", 48, "Moscow", null, null));
        familyTree.getByName("Андрей");

        View view = new Console();
        IO serialize = new IO();
        ComporatorHumanName sortName = new ComporatorHumanName();
        ComporatorHumanAge sortAge = new ComporatorHumanAge();
        ComparatorHumanPlaceOfBirth sortPlaceOfBirth = new ComparatorHumanPlaceOfBirth();
        new Presenter(view, familyTree, serialize, sortAge, sortName, sortPlaceOfBirth);
        view.start();
    }
}
