package task1.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements Serializable, Comparable<Animal> {
    private long id;
    private String name;
    private Gender gender;
    private LocalDate birthDate;
    private LocalDate deathDate;
    private Animal mother;
    private Animal father;
    private List<Animal> children = new ArrayList<>();
    private Animal spouse;
    private Animal spousa;
    private String placeOfBirth;


    public Animal(String name, Gender gender, LocalDate birthDate, String placeOfBirth, Animal mother, Animal father, Animal spouse, Animal spousa) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.mother = mother;
        this.father = father;
        this.spouse = spouse;
        this.spousa = spousa;
        this.placeOfBirth = placeOfBirth;
        children = new ArrayList<>();
    }

    public Animal(String name, Gender gender, LocalDate birthDate, String placeOfBirth) {
        this(name, gender, birthDate, placeOfBirth, null, null, null, null);
    }

    public void addChild(Animal child) {
        if (!children.contains(child)) {
            this.children.add(child);
            if (this.gender == "муж.") {
                child.father = this;
            } else
                child.mother = this;
        }
    }

    public String printChildren() {
        String res = " Дети: ";
        if (!this.children.isEmpty()) {
            for (int i = 0; i < children.size(); i++) {
                res += children.get(i).name + ",";
            }
        } else
            res += " нет";
        return res;
    }

    @Override
    public String toString() {
        String res = "Имя: " + name + ",\t Пол: " + gender + ", Возраст: " + birthDate;
        if (this.mother != null) {
            res += ", Мать: " + mother.name;
        } else
            res += ", Мать: неизвестна";

        if (this.father != null) {
            res += ", Отец: " + father.name + ",";
        } else
            res += ", Отец: неизвестен,";

        res += printChildren();

        return res;
    }

    public String getName() {
        return name;
    }

    public Animal getFather() {
        return father;
    }

    public Animal getMother() {
        return mother;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getPlaceOfBirth(){
        return placeOfBirth;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public int compareTo(Animal o) {
        return name.compareToIgnoreCase(o.name);
    }
}
