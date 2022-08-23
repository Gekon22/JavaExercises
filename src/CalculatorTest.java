import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        int secondNumber = scanner.nextInt();

        // Create new Object
        Calc calculator = new Calc();

        // Use method add
        int adding = calculator.add(firstNumber, secondNumber);
        System.out.println("Wynik dodania: " + adding);

        // use method subtract
        int subtraction = calculator.subtract(firstNumber, secondNumber);
        System.out.println("Wynik odejmowania: " + subtraction);

        // use method multiply
        int multiplying = calculator.multiply(firstNumber, secondNumber);
        System.out.println("Wynik mnożenia: " + multiplying);

        // use method divide
        int dividing = calculator.divide(firstNumber, secondNumber);
        System.out.println("Wynik dzielenia: " + dividing);







    }

}
