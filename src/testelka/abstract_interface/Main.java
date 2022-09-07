package testelka.abstract_interface;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("student", "test123");
        student.login("student", "test12");

        User user = new Professor("f", "a");
        Professor prof = new Professor("b", "b");
        Employee employee = new Professor("profesor", "test123");
        System.out.println(prof.maxVacation);
        System.out.println(Professor.maxVacation);
        Professor prof2 = new Professor("c", "c");

        Employee[] employees = {prof, prof2};
        Employee.fireE(employees);


    }
}
