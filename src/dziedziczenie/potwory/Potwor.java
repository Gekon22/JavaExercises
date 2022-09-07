package dziedziczenie.potwory;

public abstract class Potwor {
    private double predkoscChodzenia = 10;
    private double zywotnosc;

    public Potwor(){
        System.out.println("To jest domyslny konstruktor z klasy Potwor");

    }

    public Potwor(double predkoscChodzenia, double zywotnosc){
        this.predkoscChodzenia = predkoscChodzenia;
        this.zywotnosc = zywotnosc;
        System.out.println("To jest NIE domyślny konstruktor z klasy Potwor");
    }



    public abstract void atakuj();

    public double getPredkoscChodzenia(){
        return predkoscChodzenia;
    }

    public void setPredkoscChodzenia(double predkoscChodzenia){
        this.predkoscChodzenia = predkoscChodzenia;
    }

    public double getZywotnosc(){
        return zywotnosc;
    }

    public void setZywotnosc(double zywotnosc){
        this.zywotnosc = zywotnosc;
    }
}