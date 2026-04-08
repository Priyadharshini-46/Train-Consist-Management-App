import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    private String name;
    private int capacity;

    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    // Display method
    public void display() {
        System.out.println(name + " Bogie - Capacity: " + capacity);
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Step 1: Create List (reuse from previous UC)
        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("Sleeper", 72));       // duplicate type
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("AC Chair", 56));      // duplicate type

        // Step 2: Group using Stream API
        Map<String, List<Bogie>> groupedBogies = bogieList.stream()
                .collect(Collectors.groupingBy(Bogie::getName));

        // Step 3: Display grouped result
        System.out.println("Grouped Bogies by Type:");
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nBogie Type: " + entry.getKey());
            for (Bogie b : entry.getValue()) {
                b.display();
            }
        }

        // Step 4: Verify original list unchanged
        System.out.println("\nOriginal Bogie List:");
        for (Bogie b : bogieList) {
            b.display();
        }
    }
}