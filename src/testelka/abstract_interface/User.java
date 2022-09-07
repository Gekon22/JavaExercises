package testelka.abstract_interface;

public abstract class User {

    String username;
    String password;
    String name;
    String lastname;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void login(String username, String password){
        if (username.equals(this.username) && password.equals(this.password)){
            System.out.println("Logowanie uzytkownika: " + username + "/" + password);
        } else System.out.println("Nieprawidlowy login i/lub haslo.");
    }

    void logout(){
        System.out.println("Wylogowywanie");

    }

    abstract void sendMessage(String message);
}
