import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class W3_Day3_FileIO {
    private static final String FILE_NAME = "students.txt";

    public static void main(String[] args) {
        Map<String, Integer> studentRegistry = new HashMap<>();

        // 1. Load students from file (if exists)
        loadFromFile(studentRegistry);
        if (!studentRegistry.isEmpty()) {
            System.out.println("Loaded " + studentRegistry.size() + " students from file:\n");

            // 1a. Print current registry
            System.out.println("Current Registry:");
            for(Map.Entry<String, Integer> entry : studentRegistry.entrySet()) {
                String studentName = entry.getKey();
                int grade = entry.getValue();

                System.out.printf("%-10s : %3d%n",
                        studentName,
                        grade);
            }
        }
        //    Each line: "Name:Grade"  e.g. "Alice:92"

        // 2. Add a few new students (hard-coded for testing)
        System.out.println("\nAdded new students:");
        studentRegistry.put("Frank", 88);
        studentRegistry.put("Grace", 94);
        System.out.println("Frank: 88");
        System.out.println("Grace: 94");

        // 3. Print Final registry
        System.out.println("\nFinal Registry:");
        for(Map.Entry<String, Integer> entry : studentRegistry.entrySet()) {
            String studentName = entry.getKey();
            int grade = entry.getValue();

            System.out.printf("%-10s : %3d%n",
                    studentName,
                    grade);
        }

        // 4. Save the entire registry back to the file
        //    Use try-with-resources for auto-close
        System.out.println("\n=== SAVED TO FILE ===");
        saveToFile(studentRegistry);

        System.out.println("Check " + FILE_NAME + " in your project folder!");
    }

    // TODO: Write this method
    // Load students from file into the Map
    // Handle FileNotFoundException gracefully
    private static void loadFromFile(Map<String, Integer> registry) {
        // Implement reading

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if(line.contains(":")) {
                    String[] parts = line.split(":", 2); // Split only on the first colon
                    String key = parts[0].trim();       // Get key and trim whitespace
                    Integer value =  Integer.valueOf(parts[1].trim());     // Get value and trim whitespace

                    if (!key.isEmpty()) {
                        registry.put(key, value); // Add to the map
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist at: " + FILE_NAME);
        } catch (IOException e) {
            System.err.println("Error reading file: " + FILE_NAME);
            e.printStackTrace();
        }
    }

    // TODO: Write this method
    // Save all students to file
    // One student per line: "Name:Grade"
    private static void saveToFile(Map<String, Integer> registry) {
        // Implement writing with try-with-resources
        try (PrintWriter writer = new PrintWriter(FILE_NAME)) {
            for (Map.Entry<String, Integer> e : registry.entrySet()) {
                writer.println(e.getKey() + ":" + e.getValue());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not save file!");
        }
    }

}
