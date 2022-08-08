public class Auto {

    public String marka;
    public String model;
    public Integer rok;
    public int przebieg;
    public String nrRejestracyjny;

    public void jezdz() {
        System.out.println("Jedz!");
    }

    public void hamuj() {
        System.out.println("Hamuj");
    }

    public void info() {
        System.out.println("Marka: "+marka);
        System.out.println("Model: "+model);
        System.out.println("Rok: " +rok);
        System.out.println("Przebieg "+przebieg);
        System.out.println("Nr rejestracyjny: "+nrRejestracyjny);
    }
}
