public class Bike implements Vehicle {
    @Override
    public void jazda(int speed) {
        System.out.println("I ride a bike at speed " + speed);

    }

    @Override
    public void stop() {
        System.out.println("I brake a bike!");

    }

    @Override
    public String info() {
        return "Bike";
    }

    public void refuel(){
        System.out.println("I have to eat something");
    }

}
