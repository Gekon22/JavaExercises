package trainings.polymorhism.cars;

public class Sedan implements Car{
    @Override
    public void run() {
        System.out.println("Run sedan");
    }

    @Override
    public void stopCar() {
        System.out.println("Stop sedan");

    }
}
