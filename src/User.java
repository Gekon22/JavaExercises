public class User {

    public String username;
    public String password;

    public User(String username, String password)
    {
        System.out.println("Hello from constructor");
        this.username = username;
        this.password = password;

    }

    public void sayHello()
    {
        System.out.println("Hello my name is: " + username);
    }
}
