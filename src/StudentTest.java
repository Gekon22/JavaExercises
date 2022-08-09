public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.imie = "Jas";
        student1.nazwisko = "Fasola";
        student1.nick = "JF";
        student1.mail = "jf@wp.pl";
        student1.nrIndeksu = 11;

        student2.imie = "Anna";
        student2.nazwisko = "Grela";
        student2.nick = "AG";
        student2.mail = "ag@wp.pl";
        student2.nrIndeksu = 22;

        student3.imie = "Felus";
        student3.nazwisko = "Szustek";
        student3.nick = "FS";
        student3.mail = "fs@wp.pl";
        student3.nrIndeksu = 33;

        Student[] students = new Student[] {student1, student2, student3};


        for (int i=0; i< students.length; i++) {
            students[i].przedstawSie();
            students[i].zalogujSie();
            students[i].podajEmail();
            students[i].podajNrIndeksu();
        }




    }
}
