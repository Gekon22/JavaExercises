package files;

import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {

        File file = new File("test.txt");
        if (file.delete()) {
            System.out.println("The file was deleted");
        } else {
            System.out.println("It was failed");
        }
    }
}
