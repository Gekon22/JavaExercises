package testelka.abstract_interface;

public interface Employee {

    int maxVacation = 26;
    void takeVacation(int days);
    void sickLeave();
    default void quitJob() {
        System.out.println("Nara!");
    }

    static void fireE(Employee[] employees){
        for (Employee employee:employees) {
            employee.quitJob();
        }
    }
}
