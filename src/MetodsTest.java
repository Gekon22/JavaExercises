public class MetodsTest {
    public static void main(String[] args) {

        Metody metods = new Metody();

        /* int result = metods.takeTheResult();
        int result2 = result * 2;
        System.out.println("The result before multiplication is: " + result);
        System.out.println("The result after multiplication is: " + result2); */


        // metods.calculateTheResultParam(10);
        // metods.calculateTheResultParam(25);

        System.out.println(metods.add(1,2, "Hello"));
        int result = metods.add(2,3, "Hello2");
        // System.out.println(result);
        // metods.add(10, 20, "Kocham");
    }
}
