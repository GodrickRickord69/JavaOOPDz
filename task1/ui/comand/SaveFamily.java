package task1.ui.comand;

import task1.ui.Console;

public class SaveFamily extends Comand {
    public SaveFamily(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Сохранить семью. ";
    }

    @Override
    public void execute() {
        getConsole().saveFamily();
    }
}
