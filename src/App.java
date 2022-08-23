public class App {

    String name;
    int price;

    public App(String name, int price){
        this.name = name;
        this.price = price;
    }
    public void appInfo(){
        System.out.println("This is the App " + name);
    }
}
