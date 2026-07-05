package labFile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteDemo {
    /*Lab Experiment: 7
    Name- Rishi Tiwari
    Roll No- 2301641720090
    */
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("src/labFile/input.txt");
             FileWriter writer = new FileWriter("src/labFile/output.txt")) {

            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}


