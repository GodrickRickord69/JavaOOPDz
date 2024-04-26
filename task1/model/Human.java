package task1.model;

import java.time.LocalDate;

public class Human extends Animal{
    private static final long serialVersionUID = 1L;

    public Human(String name, String gender, int age, String placeOfBirth, Human mother, Human father, Human spousa, Human spouse){
        super(name, gender, age, placeOfBirth, mother, father, spousa, spouse);
    }

    public Human(String name, String gender, int age, String placeOfBirth, Animal mother, Animal father, Animal spousa, Animal spouse){
        super(name, gender, age, placeOfBirth, mother, father, spousa, spouse);
    }


}
//public class Human implements Serializable {
//    private long id;
//    private String name;
//    private Gender gender;
//    private LocalDate birthDate;
//    private LocalDate deathDate;
//    private Human mother;
//    private Human father;
//    private List<Human> children = new ArrayList<>();
//    private Human spouse;
//    private Human spousa;
//    private String placeOfBirth;
//
//    public Human(String name, Gender gender, LocalDate birthDate, String placeOfBirth, Human mother, Human father, Human spousa, Human spouse){
//        id = -1;
//        this.name = name;
//        this.gender = gender;
//        this.birthDate = birthDate;
//        this.father = father;
//        this.mother = mother;
//        this.spousa = spousa;
//        this.spouse = spouse;
//        this.placeOfBirth = placeOfBirth;
//        children = new ArrayList<>();
//    }
//
//    public Human(String name, Gender gender, LocalDate birthDate, String placeOfBirth) {
//        this(name, gender, birthDate, placeOfBirth, null, null, null);
//    }
//
//
//
//    public boolean addChild(Human child) {
//        if (!children.contains(child)) {
//            children.add(child);
//            return true;
//        }
//        return false;
//    }
//
//    public void setId(long id) {
//    this.id = id;
//}
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setGender(Gender gender) {
//        this.gender = gender;
//    }
//
//    public void setMother(Human mother) {
//        this.mother = mother;
//    }
//
//    public void setFather(Human father) {
//        this.father = father;
//    }
//
//    public void setSpousa(Human spousa) {
//        this.spousa = spousa;
//    }
//
//    public void setSpouse(Human spouse) {
//        this.spouse = spouse;
//    }
//
//    public void setBirthDate(LocalDate birthDate) {
//        this.birthDate = birthDate;
//    }
//
//    public void setPlaceOfBirth(String placeOfBirth) {
//        this.placeOfBirth = placeOfBirth;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//
//
//    public String getName() {
//        return name;
//    }
//
//    public Gender getGender() {
//        return gender;
//    }
//
//    public Human getMother() {
//        return mother;
//    }
//
//    public Human getFather() {
//        return father;
//    }
//
//    public Human getSpouse() {
//        return spouse;
//    }
//
//    public Human getSpousa() {
//        return spousa;
//    }
//
//    public List<Human> getChildren() {
//        return children;
//    }
//
//
//    public LocalDate getBirthDate() {
//        return birthDate;
//    }
//
//    public String getPlaceOfBirth(){
//        return placeOfBirth;
//    }
//
//    @Override
//    public String toString() {
//        return getInfo();
//    }
//
//    public String getInfo() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("id: ");
//        sb.append(id);
//        sb.append(", имя: ");
//        sb.append(name);
//        sb.append(", пол: ");
//        sb.append(getGender());
//        sb.append(", возраст: ");
//        sb.append(getBirthDate());
//        sb.append(", день рождения");
//        sb.append(getPlaceOfBirth());
//        sb.append(" , место рождение: ");
//        sb.append(getMotherInfo());
//        sb.append(", ");
//        sb.append(getFatherInfo());
//        sb.append(", ");
//        sb.append(getChildrenInfo());
//
//
//        if (gender == Gender.Female){
//            sb.append("Семейное положение: ");
//            sb.append(getSpousaInfo()); sb.append(". ");
//        }
//        else{
//            sb.append("Семейное положение: ");
//            sb.append(getSpouseInfo()); sb.append(". ");
//        }
//        return sb.toString();
//    }
//
//    public String getMotherInfo() {
//        String res = "мать: ";
//        Human mother = getMother();
//        if (mother != null) {
//            res += mother.getName();
//        } else {
//            res += "неизвестна";
//        }
//        return res;
//    }
//
//    public String getFatherInfo() {
//        String res = "отец: ";
//        Human father = getFather();
//        if (father != null) {
//            res += father.getName();
//        } else {
//            res += "неизвестен";
//        }
//        return res;
//    }
//
//    public String getChildrenInfo() {
//        StringBuilder res = new StringBuilder();
//        res.append("дети: ");
//        if (!children.isEmpty()) {
//            res.append(children.get(0).getName());
//            for (int i = 1; i < children.size(); i++) {
//                res.append(", ");
//                res.append(children.get(i).getName());
//            }
//        } else {
//            res.append("отсутствуют");
//        }
//        return res.toString();
//    }
//
//    public String getSpouseInfo() {
//        String res = "супруг: ";
//        if (spouse == null) {
//            res += "нет";
//        } else {
//            res += spouse.getName();
//        }
//        return res;
//    }
//
//    public String getSpousaInfo() {
//        String res = "супруга: ";
//        if (spousa == null) {
//            res += "нет";
//        } else {
//            res += spousa.getName();
//        }
//        return res;
//    }
//
//
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (!(obj instanceof Human))  return false;
//        Human human = (Human) obj;
//        return human.getName().equals(getName());
//    }
//}