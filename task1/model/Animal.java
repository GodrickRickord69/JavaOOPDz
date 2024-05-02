package task1.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements Serializable, Comparable<Animal> {
    private long id;
    private String name;
    private String gender;
    private int age;
    private Animal mother;
    private Animal father;
    private List<Animal> children = new ArrayList<>();
    private String placeOfBirth;


    public Animal(String name, String gender, int age, String placeOfBirth, Animal mother, Animal father) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.mother = mother;
        this.father = father;
        this.placeOfBirth = placeOfBirth;
        children = new ArrayList<>();
    }

    public Animal(String name, String gender, int age, String placeOfBirth) {
        this(name, gender, age, placeOfBirth, null, null);
    }

    public void addChild(Animal child) {
        if (!children.contains(child)) {
            this.children.add(child);
            switch (this.gender) {
                case "Male." -> child.father = this;
                case null, default -> child.mother = this;
            }
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
        String res = "Имя: " + name + ",\t Пол: " + gender + ", Возрост: " + age;
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

    public Integer getAge() {
        return age;
    }

    public String getPlaceOfBirth(){
        return placeOfBirth;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Animal o) {
        return name.compareToIgnoreCase(o.name);
    }
}
