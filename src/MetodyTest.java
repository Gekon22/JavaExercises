public class MetodyTest {

    public static void main(String[] args) {
        Metody metody = new Metody();

        int result = metody.pobierzWynik();
        int result2 = result*2;
        System.out.println("Rez przed mn: "+result);
        System.out.println("Rezultat po mnożeniu to: "+result2);
    }
}
