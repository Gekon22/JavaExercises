package instanceof_;

public class Pracownik extends Osoba{
    int wynagrodzenie;

    Pracownik(String imie, String nazwisko, int wynagrodzenie) {
        super(imie, nazwisko);
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    void pobierzOpis() {
        System.out.println("jestem pracownikiem");
        System.out.println("Moje imie to: " + imie);
        System.out.println("Moje nazwisko to: " + nazwisko);
        System.out.println("Moje wynagrodzenie to: " + wynagrodzenie);
    }
}
