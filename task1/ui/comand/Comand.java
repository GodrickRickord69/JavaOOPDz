package task1.ui.comand;

import task1.ui.Console;

public abstract class Comand implements Option {
    private Console console;

    public Comand(Console console) {
        this.console = console;
    }

    public Console getConsole() {
        return console;
    }

}
