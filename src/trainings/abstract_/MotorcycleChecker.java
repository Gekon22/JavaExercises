package trainings.abstract_;

public class MotorcycleChecker {
    public static void main(String[] args) {
        Motorcycle moto = new CrossMotor();
        System.out.println("My cross has " + moto.wheels + " wheels");
        moto.run();
        moto.stop();
        moto.refuel();

        Motorcycle moto2 = new SportMotor();
        moto2.run();
        moto2.stop();
    }
}
