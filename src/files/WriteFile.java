package files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("test.txt");
        writer.write("Some text");
        writer.close();
    }
}
