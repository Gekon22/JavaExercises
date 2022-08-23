import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        int secondNumber = scanner.nextInt();


         System.out.println("Wynik dodania: " + (firstNumber+secondNumber));
        System.out.println("Wynik odejmowania: " + (firstNumber-secondNumber));
        System.out.println("Wynik mnożenia: " + (firstNumber*secondNumber));
        // friendly information
        if (secondNumber !=0) {
            System.out.println("Wynik dzielenia: " + (firstNumber/secondNumber));
        } else {
            System.out.println("Cannot be divided by zero");



        }



    }

}
