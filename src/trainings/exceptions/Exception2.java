package trainings.exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {

        int password = 1234;
        int enteredPassword = 0;
        boolean dsc;
        System.out.println("Enter password: ");
        // do { dsc = true;
            try (Scanner scanner = new Scanner(System.in)) {
                enteredPassword = scanner.nextInt();
            } catch (InputMismatchException e) {
                dsc = false;
                System.out.println("Only numbers! Try again.");
            }
        // }
        // while (dsc == false);


        if (enteredPassword == password) {
            System.out.println("You're logged in");
        } else {
            System.out.println("Wrong password");
        }



    }
}
