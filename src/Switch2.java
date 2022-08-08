public class Switch2 {
    public static void main(String [] args){

        String course = "burger";

        switch(course) {
            case "Pizza":
                System.out.println("2 zl");
                break;
            case "Chips":
                System.out.println("5 zl");
                break;
            case "Burger":
                System.out.println("10 zl");
                break;
            default:
                System.out.println("Takiego ni ma");
        }
    }
}
