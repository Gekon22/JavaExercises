public class Footballer extends Person {

    public String footballClub;


    public Footballer(String name, int age, String footballClub) {
        super(name, age);
        System.out.println("Jestem w konstruktorze footballer");
        this.footballClub = footballClub;
    }

    public void playFootbal() {

        System.out.println("I'm playing football for " + footballClub);
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
        System.out.println("Hello, my age is " + age);
    }
}
