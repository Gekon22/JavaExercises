package trainings.polymorhism.cars;

public class Suv implements Car{
    @Override
    public void run() {
        System.out.println("Run SUV");
    }

    @Override
    public void stopCar() {
        System.out.println("Stop SUV");

    }
}
