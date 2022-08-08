public class AutoTest {

    public static void main(String[] args) {

        Auto bmw = new Auto();
        bmw.marka = "BMW";
        bmw.model = "320";
        bmw.rok = 2022;
        bmw.przebieg = 108;
        bmw.nrRejestracyjny = "KR1234";

        bmw.jezdz();
        bmw.hamuj();
        bmw.info();

        Auto volvo = new Auto();
        volvo.marka = "Volvo";
        volvo.model = "V60";
        volvo.rok = 2014;
        volvo.przebieg = 159000;
        volvo.nrRejestracyjny = "KR7MM61";

        volvo.jezdz();
        volvo.hamuj();
        volvo.info();

        Auto noName = new Auto();
        noName.jezdz();
        noName.hamuj();
        noName.info();
    }
}
