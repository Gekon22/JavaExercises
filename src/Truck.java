public class Truck implements Vehicle{
    @Override
    public void jazda(int speed) {
        System.out.println("I drive a truck at speed: " + speed);
    }

    @Override
    public String info() {
        return "Truck";
    }

    @Override
    public void stop() {
        System.out.println("I try to stop my truck!");



    }

    public void refuel(){
        System.out.println("I should go to gas station");
    }
}
