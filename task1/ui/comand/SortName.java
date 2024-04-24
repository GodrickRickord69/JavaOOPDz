package task1.ui.comand;

import task1.ui.Console;

public class SortName extends Comand {
    public SortName(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Сортировка семьи по имени. ";
    }

    @Override
    public void execute() {
        getConsole().sortFamilyName();
    }
}