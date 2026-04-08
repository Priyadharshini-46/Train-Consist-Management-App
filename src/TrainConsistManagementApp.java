import java.util.*;

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
        bogieList.add(new Bogie("First Class", 24));

        // Step 2: Stream → map → reduce
        int totalCapacity = bogieList.stream()
                .map(b -> b.getCapacity())   // extract capacity
                .reduce(0, Integer::sum);    // aggregate

        // Step 3: Display total
        System.out.println("Total Seating Capacity of Train: " + totalCapacity);

        // Step 4: Verify original list unchanged
        System.out.println("\nOriginal Bogie List:");
        for (Bogie b : bogieList) {
            b.display();
        }
    }
}