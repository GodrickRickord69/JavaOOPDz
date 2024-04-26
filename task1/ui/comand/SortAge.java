package task1.ui.comand;

import task1.ui.Console;

public class SortAge extends Comand{
    public SortAge(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Сортировка семьи возрасту. ";
    }

    @Override
    public void execute() {
        getConsole().sortByAge();
    }
}
