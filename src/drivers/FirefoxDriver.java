package drivers;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Otwieram Firefox");

    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduję Firefoxem");

    }
}
