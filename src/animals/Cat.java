package animals;

public class Cat extends Animal{
    @Override
    public void sound() {
        System.out.println("Meow!");
    }

    @Override
    public void sayHello() {

        System.out.println("I am cat :)");
    }
}
