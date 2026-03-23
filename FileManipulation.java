import java.io.*;

public class FileManipulation {

    public static void main(String[] args) {
        String filename = "example.txt";  // Name of the file
        String content = "Hello, this is a test.\nWelcome to Java file handling!";

        // Writing to a file
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
            System.out.println("Data successfully written to " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        // Reading from the file
        System.out.println("\nReading contents of the file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Display each line on the console
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
