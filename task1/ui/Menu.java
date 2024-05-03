package task1.ui;

import task1.ui.comand.*;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Option> comand;
    private Console console;

    public Menu(Console console) {
        this.console = console;
        comand = new ArrayList<>();
        comand.add(new AddHuman(console));
        comand.add(new FamilyPrint(console));
        comand.add(new HumanSearch(console));
        comand.add(new SortName(console));
        comand.add(new SortPlaceOfBirth(console));
        comand.add(new SortAge(console));
        comand.add(new SaveFamily(console));
        comand.add(new Load(console));
        comand.add(new Exit(console));
    }

    void execute(int num) {
        Option option = comand.get(num - 1);
        option.execute();
    }

    public String printMenu() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n\t- =  Меню  = -\n\n");
        for (int i = 0; i < comand.size(); i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(". ");
            stringBuilder.append(comand.get(i).description());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public Console getConsole() {
        return console;
    }

}