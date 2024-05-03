package task1.ui.comand;

import task1.ui.Console;

public class SortPlaceOfBirth extends Comand {
    public SortPlaceOfBirth(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Сортировка семьи по месту рождения. ";
    }

    @Override
    public void execute() {
        getConsole().sortByPlaceOfBirth();
    }

}