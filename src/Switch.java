import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {





        Scanner scanner = new Scanner(System.in);
        System.out.println("Co sobie zyczysz?");
        String dish = scanner.next();

        switch (dish) {
            case "pizza":
                System.out.println("Cena to 10 zl");
                break;
            case "fryty":
                System.out.println("Cena to 5 zl");
                break;
            case "hamburger":
                System.out.println("cena to 7 zl");
                break;
            default:
                System.out.println("Nie mamy takiego dania");
        }

    }
}
