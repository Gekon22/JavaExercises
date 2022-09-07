package trainings.polymorhism.cars;

import java.util.Scanner;

public class CarChecker {
    public static void main(String[] args) {

        // getting the type of car
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type of car (SUV, sedan)");
        String name = scanner.nextLine();

        Car car = getCar(name);
        car.stopCar();
        car.run();

    }
    public static Car getCar(String name){
        if(name.equals("SUV")){
            return new Suv();
        }
        else if (name.equals("sedan")) {
            return new Sedan();
        }
        return null;



    }
}
