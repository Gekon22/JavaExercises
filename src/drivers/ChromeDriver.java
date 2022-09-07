package drivers;

public class ChromeDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Otwieram Chrome");

    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduje Chromem...");

    }

    public void method() {
        System.out.println("a");
    }
}
