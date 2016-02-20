package students;

public class Main {
    public static void main(String[]args){

        Man man1 = new Man();
        Man man2 = new Man();

        man1.name = "Andrew";
        man1.surname = "Adamson";
        man1.age = 20;
        man1.height = 180;
        man1.weight = 63;

        man2.name = "Alex";
        man2.surname = "Barrington";
        man2.age = 19;
        man2.height = 178;
        man2.weight = 70;

        System.out.println("Student #1");
        System.out.println("Name: " + man1.name);
        System.out.println("Surname: " + man1.surname);
        System.out.println("Age: " + man1.age);
        System.out.println("Height: " + man1.height);
        System.out.println("Weight: " + man1.weight);
        System.out.println("___________________________");
        System.out.println("Student #2");
        System.out.println("Name: " + man2.name);
        System.out.println("Surname: " + man2.surname);
        System.out.println("Age: " + man2.age);
        System.out.println("Height: " + man2.height);
        System.out.println("Weight: " + man2.weight);
    }
}
