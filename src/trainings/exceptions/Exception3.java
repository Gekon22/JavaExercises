package trainings.exceptions;

import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) throws NotValidAge{

        System.out.println("Enter age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("OK");
        }
        else if (age >= 0 && age < 18) {
            System.out.println("Not OK");
        }
        else {
            throw new NotValidAge("Entered number < 0 :" + age);
        }
    }
}
