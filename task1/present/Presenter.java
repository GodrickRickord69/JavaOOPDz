package task1.present;

import task1.model.Comparator.ComparatorHumanPlaceOfBirth;
import task1.model.Comparator.ComporatorHumanAge;
import task1.model.Comparator.ComporatorHumanName;
import task1.model.FamilyTree;
//import task1.model.Gender;
import task1.model.Human;
import task1.model.IO;
import task1.ui.View;

import java.time.LocalDate;

public class Presenter {
    private View view;
    private IO serialize;
    private FamilyTree<Human> familyConnect;
    private ComporatorHumanAge sortByBirtDay;

    public Presenter(View view, FamilyTree<Human> familyConnect, IO serialize, ComporatorHumanAge sortByAge, ComporatorHumanName sortByName, ComparatorHumanPlaceOfBirth sortByPlaceOfBirth) {
        this.familyConnect = familyConnect;
        this.view = view;
        this.serialize = serialize;
        view.setPresenter(this);
    }

    public void addHumanNew(String name, String gender, Integer age, String placeOfBirth) {
        familyConnect.addFamilyTree(new Human(name, gender, age, placeOfBirth, null, null, null, null));
        view.print("Новый член семьи добавлен !");
    }

    public void familyPrint() {
        String family = familyConnect.toString();
        view.print(family);
    }

    public void humanSearch(String name) {
        Human human = familyConnect.getByName(name);
        if (human == null)
            view.print("Такого человека нет в семье !");

        else {
            String foundHuman = human.toString();
            view.print(foundHuman);
        }
    }

    public void saveFamily() {
        familyConnect.saveObj(serialize);
        view.print("Семейное древо сохранено !");
    }

    public void loadFamily() {
        serialize.load("TreeFamily.data");
    }

//    public void sortFamilyName() {
//        familyConnect.getFamilyTree().sort(null);
//        view.print("Сортировка завершена !");
//    }

    public void sortByName(){
        familyConnect.getFamilyTree().sort(null);
    }
    public void sortByAge(){
        familyConnect.getFamilyTree().sort(null);
    }
    public void sortByPlaceOfBirth(){
        familyConnect.getFamilyTree().sort(null);
    }
}
