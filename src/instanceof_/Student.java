package instanceof_;

public class Student extends Osoba{

    Student(String imie, String nazwisko) {
        super(imie, nazwisko);
    }

    @Override
    void pobierzOpis() {
        System.out.println("jestem studentem");
        System.out.println("Moje imie to: " + imie);
        System.out.println("Moje nazwisko to: " + nazwisko);

    }
}
