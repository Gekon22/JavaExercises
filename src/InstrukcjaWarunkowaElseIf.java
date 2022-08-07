import java.util.Scanner;

public class InstrukcjaWarunkowaElseIf {
    public static void main(String[] args){

        Scanner scanne = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = scanne.nextInt();

        if(number ==0) {
            System.out.println("Liczba równa zero");
        } else if(number > 0) {
            System.out.println("Liczba dodatnia");
        } else if (number < -5) {
            System.out.println("Liczba mniejsza od -5");
        } else {
            System.out.println("Żaden warunek nie zostal spelniony");
        }
    }
}
