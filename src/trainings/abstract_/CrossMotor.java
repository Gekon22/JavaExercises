package trainings.abstract_;

public class CrossMotor extends Motorcycle{




    @Override
    public void run() {
        System.out.println("I ride on cross");
    }

    @Override
    public void stop() {
        System.out.println("I stop my cross");

    }
    public void refuel(){
        super.refuel();
        System.out.println("My moto has little container");
    }

}
