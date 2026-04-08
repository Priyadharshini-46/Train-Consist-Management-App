import java.util.Arrays;

public class TrainConsistManagementApp {

    // 🔹 Method to sort bogie names
    public static void sortBogieNames(String[] bogieNames) {
        Arrays.sort(bogieNames); // Built-in sorting
    }

    // 🔹 Utility Method to Print Array
    public static void printArray(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // 🔹 Main Method
    public static void main(String[] args) {

        // 🔹 Test Case 1: Basic Unsorted Input
        String[] bogies1 = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};
        System.out.println("Before Sorting:");
        printArray(bogies1);

        sortBogieNames(bogies1);

        System.out.println("After Sorting:");
        printArray(bogies1);

        // 🔹 Test Case 2: Unsorted Input
        String[] bogies2 = {"Luxury", "General", "Sleeper", "AC Chair"};
        sortBogieNames(bogies2);

        // 🔹 Test Case 3: Already Sorted
        String[] bogies3 = {"AC Chair", "First Class", "General"};
        sortBogieNames(bogies3);

        // 🔹 Test Case 4: Duplicate Values
        String[] bogies4 = {"Sleeper", "AC Chair", "Sleeper", "General"};
        sortBogieNames(bogies4);

        // 🔹 Test Case 5: Single Element
        String[] bogies5 = {"Sleeper"};
        sortBogieNames(bogies5);
    }
}