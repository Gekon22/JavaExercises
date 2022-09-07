package testelka.abstract_interface;

public class Professor extends User implements Employee {


    Professor(String username, String password){
        super(username, password);
    }

    public void giveNotes() {
        System.out.println("Nadaje oceny");
    }

    void cancelClass() {
        System.out.println("Odwoluje lekcje");
    }

    void sendMessage(String message) {
        System.out.println("Wysylanie wiadomosci dla studentow:");
        System.out.println(message);
    }

    @Override
    public void takeVacation(int days) {

    }

    @Override
    public void sickLeave() {

    }

    @Override
    public void quitJob() {

        System.out.println("aa");
    }
}
