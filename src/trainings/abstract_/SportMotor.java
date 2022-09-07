package trainings.abstract_;

public class SportMotor extends Motorcycle{
    @Override
    public void run() {
        System.out.println("I ride on SportMotorcycle");
    }

    @Override
    public void stop() {
        System.out.println("I stop my SportMotorcycle");

    }
}
