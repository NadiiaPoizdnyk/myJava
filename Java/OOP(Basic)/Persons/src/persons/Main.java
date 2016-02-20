package persons;

public class Main {
    public static void main(String[] args) {

        Me person = new Me();

        person.setFullName(person.firstName, person.middleName, person.lastName);
        System.out.println(person.getFullName());
        int a = person.getAge();
        System.out.println();

    }
}
