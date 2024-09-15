package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SimpleThrows {
    public static void findFile() throws IOException {
        File newFile = new File("test.txt");
        FileInputStream fileInputStream = new FileInputStream(newFile);
    }

    public static void main(String[] args) {
        try {
            findFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
