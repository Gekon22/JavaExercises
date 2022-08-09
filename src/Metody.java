public class Metody {

    public void policzWynik() {
        System.out.println("Zaraz policze wynik");
        int result = 0;
        for (int i=0; i<100; i++) {
            result = result + i;

        }
        System.out.println("Rezultat to: " +result);
    }

    public int pobierzWynik() {
        System.out.println("Zaraz policze wynik");
        int result = 0;
        for (int i=0; i<100; i++) {
            result = result + i;

        }
        System.out.println("Rezultat to: " +result);
        return result;
    }
}
