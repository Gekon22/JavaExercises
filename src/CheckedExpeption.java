import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExpeption {

    public static void readFile (String path){
        try {
            System.out.println("Before open file");
            FileInputStream fileInputStream = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            System.out.println("The file has been thrown");
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
        } finally {
            System.out.println("File was closed");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        readFile("C:\\Users\\grzeg\\Desktop\\java\\src\\hh.txt");
    }
}
