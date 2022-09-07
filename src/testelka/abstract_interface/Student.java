package testelka.abstract_interface;

public class Student extends User{

    Student(String username, String password) {
        super(username, password);
    }

    void checkNotes() {
        System.out.println("Sprawdzam oceny");
    }

    void skipClass() {
        System.out.println("Ide na wagary");
    }

    void sendMessage(String message) {
        System.out.println("Wysylam wiadomosc do profesora");
    }
}
