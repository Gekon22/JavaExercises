import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbe");
        float firstNumber = scanner.nextFloat();
        System.out.println("Podaj drugą liczbe");
        float secondNumber = scanner.nextFloat();

        System.out.println("Wynik dodania: " + (firstNumber+secondNumber));
        System.out.println("Wynik mnożenia: " + firstNumber*secondNumber);
        System.out.println("Wynik modulo: " + firstNumber%secondNumber);
        System.out.println("Wynik preinkrementacji pierwszej liczby: " + ++firstNumber);
        System.out.println("Wynik postdekrementacji drugiej liczby: " + secondNumber--);


    }
}
