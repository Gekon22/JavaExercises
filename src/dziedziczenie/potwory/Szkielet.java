package dziedziczenie.potwory;

public class Szkielet extends Potwor{

    String typBroni;

    public Szkielet(){
        System.out.println("To jest domyslny konstruktor z klasy Szkielet");
    }

    public Szkielet(double predkoscChodzenia, double zywotnosc){
        super(predkoscChodzenia, zywotnosc);
        System.out.println("To jest NIE domyslny konstruktor z klasy Szkielet");
    }

    public Szkielet(double predkoscChodzenia, double zywotnosc, String typBroni){
        super(predkoscChodzenia, zywotnosc);
        this.typBroni = typBroni;
        System.out.println("To jest NIE domyslny konstruktor z klasy Szkielet nr2");
    }

    public void atakuj(){

        System.out.println("To jest metoda atakuj z klasy Szkielet");
    }

    public void method() {

    }
}
