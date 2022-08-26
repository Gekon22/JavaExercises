public class MathTeacher extends Person {

    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        System.out.println("Jestem w konstruktorze mathteacher");
        this.school = school;
    }

    public void teachMath() {
        System.out.println("I'm teaching Math at " + school);
    }

    public void walk(){
        super.walk();

        System.out.println("I walk very fast!");
    }

    public void sayHello(){
        System.out.println("Hello, my name is " + name);
        System.out.println("Hello, my age is " + age);
    }
}
