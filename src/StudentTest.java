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

        String[] grupaStudentow = new String[3];
        grupaStudentow[0] = student1.toString();
        grupaStudentow[1] = student2.toString();
        grupaStudentow[2] = student3.toString();

        for (int i=0; i< grupaStudentow.length; i++){
            System.out.println(grupaStudentow[i]);
        }

    }
}
