import java.util.Scanner;

public class CustomScanner {

/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie swe prosze");
        String name = scanner.nextLine();
        System.out.println("Czesc " + name + "!");
    }*/

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj druga liczbe");
        int secondNumber = scanner.nextInt();
        int thirdNumber = firstNumber + secondNumber;
        System.out.println("A wynik dodania tych liczb to: " + thirdNumber);

    }
}
