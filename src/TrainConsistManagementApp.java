import java.util.LinkedList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for ordered train consist
        List<String> trainConsist = new LinkedList<>();

        // Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Insert Pantry Car at position 2 (index starts at 0)
        trainConsist.add(2, "Pantry Car");

        // Remove first and last bogie
        trainConsist.remove(0); // removes Engine
        trainConsist.remove(trainConsist.size() - 1); // removes Guard

        // Display final ordered train consist
        System.out.println("\nFinal ordered train consist:");
        System.out.println(trainConsist);

        // Program continues...
    }
}