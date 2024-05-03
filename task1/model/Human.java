package task1.model;



public class Human extends Animal{
    private static final long serialVersionUID = 1L;

    public Human(String name, String gender, int age, String placeOfBirth, Human mother, Human father){
        super(name, gender, age, placeOfBirth, mother, father);
    }

    public Human(String name, String gender, int age, String placeOfBirth, Animal mother, Animal father){
        super(name, gender, age, placeOfBirth, mother, father);
    }

}
