package task1.ui.comand;

import task1.ui.Console;

public class Load extends Comand {
    public Load(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Загрузить семью. ";
    }

    @Override
    public void execute() {
        getConsole().loadFamily();
    }
}
