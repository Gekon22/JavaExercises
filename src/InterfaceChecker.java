public class InterfaceChecker {

    public static void main(String[] args) {

        // FirefoxDriver firefoxDriver = new FirefoxDriver();
        // firefoxDriver.get();
        // firefoxDriver.findElementBy();

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get();

        System.out.println(chromeDriver.findElementBy());
    }
}
