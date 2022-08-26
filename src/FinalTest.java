public class FinalTest {

    public static void main(String[] args) {

        final int x = 2;
        // x = 5;

        Person person = new Person("Tim", 25);
        person.age = 26;

        person = new Person("Tom", 22);
        System.out.println(person.name);
    }
}
