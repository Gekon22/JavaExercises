package dziedziczeni;

import dziedziczenie.potwory.Potwor;
import dziedziczenie.potwory.Szkielet;
import dziedziczenie.potwory.Zombie;

public class Dziedziczenie {
    public static void main(String[] args) {

        // Potwor p = new Potwor(10, 100);
        // System.out.println(p.getPredkoscChodzenia());

        // Szkielet s = new Szkielet(2,20);
        // Zombie z = new Zombie(3,30);
        // Zombie z2 = new Zombie(3,30,"M", 1);
        // System.out.println("My madness level is " + z2.madnessLevel);
        // Szkielet s2 = new Szkielet(4,40, "Łuk");
        Potwor p = new Szkielet();
        p.atakuj();
        Szkielet sz = new Szkielet();




    }
}
