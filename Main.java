public class Main {
    public static void main(String[] args) {
        //member1 - это родитель member2
        //member2 - это родитель member3 и member4

        Person member1 = new Person("Петров", "Сергей");
        Person member2= new Person("Петров","Павел", member1);
        Person member3= new Person("Петров","Игорь", member2);
        Person member4= new Person("Петрова", "Маша", member2);


        System.out.println("Перечень людей: " + Person.getPersons());

        System.out.println();

        System.out.println("Дети человека 1: " + member2.getChildren());
        System.out.println("Дети человека 2: " + member3.getChildren() + " и " + member4.getChildren());
        //System.out.println("Дети человека 3: " + member4.getChildren());

        System.out.println();

        System.out.println("Родители человека 1: " + member1.getParent());
        System.out.println("Родители человека 2: " + member2.getParent());
        System.out.println("Родители человека 3: " + member3.getParent());
        System.out.println("Родители человека 4: " + member4.getParent());

    }
}
