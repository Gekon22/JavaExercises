public class PersonTest {

    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 29, "UJ");
        teacher.walk();
        teacher.eat();
        teacher.sayHello();
        teacher.teachMath();
        System.out.println();

        Footballer footballer = new Footballer("Mike", 21, "Wiecz.");
        footballer.walk();
        footballer.eat();
        footballer.sayHello();
        footballer.playFootbal();
    }
}
