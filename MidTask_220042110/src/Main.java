import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String[] textFiles = {
                "Task-1-110.txt"

        };

        // Create each file
        for (String textFile : textFiles) {
            createtextFile(textFile);
        }
    }
    private static void createtextFile(String fileName) {
        File file = new File(fileName);
        try {
            // Create the file
            if (file.createNewFile()) {
                System.out.println("text file created: " + file.getName());
            } else {
                // System.out.println("CSV file already exists: " + file.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating: " + fileName);
            e.printStackTrace();
        }
    }
}