import java.util.Scanner;

public class OperatoryPorownania {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("Podaj pierwsza liczbe");
       int firstNumber = scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        int secondNumber = scanner.nextInt();

        System.out.println("a>b: " + (firstNumber > secondNumber));
        System.out.println(firstNumber < secondNumber);
        System.out.println(firstNumber >= secondNumber);
        System.out.println(firstNumber <= secondNumber);
        System.out.println(firstNumber == secondNumber);
        System.out.println(firstNumber != secondNumber);
    }
}
