package trainings.static_;

public class Employee {

    int id;
    static int id2 = 1;
    static final int maxHolidaysDays = 26;
    int usedVacationDays = 0;
    final String lastname;

    public Employee(String lastname) {
        this.lastname = lastname;
        id = id2;
        id2++;
    }

    void Vacations(int days) {
        if (usedVacationDays + days <= maxHolidaysDays) {
            usedVacationDays += days;
            System.out.println("Przyznano urlop na dni: " + days);
            System.out.println("Pozostało do następnego wykorzystania dni: " + (maxHolidaysDays - usedVacationDays));
        } else {
            System.out.println("Urlop przekracza liczbę dostepnych dni. Do wykorzystania zostalo dni " + (maxHolidaysDays - usedVacationDays));
        }
    }
}
