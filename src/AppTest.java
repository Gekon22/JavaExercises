public class AppTest {
    public static void main(String[] args) {

        IphoneApp app = new IphoneApp("GG_I", 1000);
        app.appInfo();
        app.runIphoneApp();

        AndroidApp app2 = new AndroidApp("GG_A", 108);
        app2.appInfo();
        app2.runAndroidApp();

    }
}
