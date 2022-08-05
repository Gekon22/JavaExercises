// umożliwiają wykonywanie podstawowych operacji matematycznych
public class OperatoryMatematyczne {

    public static void main(String[] args) {

        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4;

        int addition = firstNumber + secondNumber; // 10
        int subtraction = firstNumber - secondNumber; // -2
        int multiplication = firstNumber * secondNumber; // 24
        float division = thirdNumber / secondNumber; // 0,66
        int mod = secondNumber % firstNumber; // 6

        System.out.println("Wynik dodawania " + addition);
        System.out.println("Wynik odejmowania " + subtraction);
        System.out.println("Wynik mnożenia " + multiplication);
        System.out.println("Wynik dzielenia = " + division);
        System.out.println("Modulo: " + mod);

    }
}
