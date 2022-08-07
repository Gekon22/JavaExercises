import java.util.Scanner;

public class PytanieOWiek {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoj wiek");
        int age = scanner.nextInt();

        if (age<18) {
            System.out.println("Nie mozesz kupic woody");
        } else if (age>=18 && age<=100) {
            System.out.println("A to se pic mozesz");
        } else
            System.out.println("No co Ty, to cie zabije!");
    }
}
