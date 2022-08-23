public class IphoneApp extends App {

    public IphoneApp(String name, int price){
        super(name, price);
        System.out.println("My price is " + price);
    }
    public void runIphoneApp(){
        System.out.println("App " + name + " is running on Iphone System");
    }

}
