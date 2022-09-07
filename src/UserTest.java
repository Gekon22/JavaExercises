import trainings.static_.Employee;

public class UserTest {

    public static void main(String[] args) {

        // User user = new User();
        User user = new User("aa", "bb");

        /* user.username = "Gekonik";
        user.password = "Om"; */
        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();

    }
}
