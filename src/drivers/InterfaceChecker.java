package drivers;

public class InterfaceChecker {
    public static void main(String[] args) throws NoValidBrowserName {

       /* ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get();
        chromeDriver.findElementBy();
        chromeDriver.findElementBy();
        chromeDriver.findElementBy();
        chromeDriver.findElementBy();

        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get();
        firefoxDriver.findElementBy();
        firefoxDriver.findElementBy();
        firefoxDriver.findElementBy();
        firefoxDriver.findElementBy(); */

        WebDriver driver = getDriver("chromee");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();




        WebDriver driver2 = new ChromeDriver();

        ChromeDriver chromeDriver2 = (ChromeDriver) driver2;

        chromeDriver2.get();


    }

    public static WebDriver getDriver(String name) throws NoValidBrowserName {
        if (name.equals("chrome")) {
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        }
        throw new NoValidBrowserName("Invalid name");
    }
}



