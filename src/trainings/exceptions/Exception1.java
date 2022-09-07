package trainings.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) throws NegativeAge {

        System.out.println("Enter Your age: ");
        int age = 0;





        if (age >= 18) {
            System.out.println("It's ok, You can come in");
        } else if (age >=0 && age < 18) {
            System.out.println("You can not come in, get out of here!");
        }




    }
}
