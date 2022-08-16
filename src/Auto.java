public class Auto {

    String marka;
    public String model;
    public int rok;
    public int przebieg;
    public String nrRejestracyjny;

    public Auto(String marka, String model, int rok, int przebieg, String nrRejestracyjny) {
        this.marka = marka;
        this.model = model;
        this.rok = rok;
        this.przebieg = przebieg;
        this.nrRejestracyjny = nrRejestracyjny;


    }

    public void jezdz() {
        System.out.println("Jedz!");
    }

    public void hamuj() {
        System.out.println("Hamuj");
    }

    public void info()
    {
        System.out.println("Marka: "+marka);
        System.out.println("Model: "+model);
        System.out.println("Rok: " +rok);
        System.out.println("Przebieg "+przebieg);
        System.out.println("Nr rejestracyjny: "+nrRejestracyjny);
        System.out.println();
    }


}
