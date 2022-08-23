// Klasa pobiera dane od użytkownika, sprawdza czy jest w tabeli i podaje wynik

import java.util.Scanner;

public class CwiczenieElsIfSwitch {
    public static void main(String[] args) {

        // pobranie danych od uzytkownika
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj 1=Alfa, 2=Volvo, 3=Kia");
        int marka = odczyt.nextInt();

        // utworzenie tabeli z rejestracjami
        String[] rejestracje = new String[3];
        rejestracje[0] = "KR3231";
        rejestracje[1] = "KR7MM61";
        rejestracje[2] = "KR7AW80";

        // przeszukanie i wynikowanie
        if (marka == 1) {
            System.out.println(rejestracje[0]);
        } else if (marka == 2) {
            System.out.println(rejestracje[1]);
        } else if (marka == 3) {
            System.out.println(rejestracje[2]);
        } else {
            System.out.println("Nie ma takiego");
        }





        /* // przeszukanie i wynikowanie
        switch (marka){
            case "Alfa":
                System.out.println(rejestracje[0]);
                break;
            case "Volvo":
                System.out.println(rejestracje[1]);
                break;
            case "Kia":
                System.out.println(rejestracje[2]);
                break;
            default:
                System.out.println("Takiego nie ma");
        } */


    }
}


