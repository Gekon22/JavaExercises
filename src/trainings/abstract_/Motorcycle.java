package trainings.abstract_;

public abstract class Motorcycle {

    Motorcycle(){

    }

    public final int wheels = 2;
    public abstract void run();
    public abstract void stop();
    // abstract void method();
    public void refuel(){
        System.out.println("I have to refuel my motorcycle");
    }
}
