public class TrainConsistManagementApp {

    // 🔹 Bubble Sort Method
    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop for comparisons
            for (int j = 0; j < n - i - 1; j++) {

                // 🔹 Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // 🔹 Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }

    // 🔹 Utility Method to Print Array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 🔹 Main Method
    public static void main(String[] args) {

        // 🔹 Test Case 1: Basic Unsorted Array
        int[] capacities1 = {72, 56, 24, 70, 60};
        System.out.print("Before Sorting: ");
        printArray(capacities1);

        bubbleSort(capacities1);

        System.out.print("After Sorting:  ");
        printArray(capacities1);

        // 🔹 Test Case 2: Already Sorted
        int[] capacities2 = {24, 56, 60, 70, 72};
        bubbleSort(capacities2);

        // 🔹 Test Case 3: Duplicate Values
        int[] capacities3 = {72, 56, 56, 24};
        bubbleSort(capacities3);

        // 🔹 Test Case 4: Single Element
        int[] capacities4 = {50};
        bubbleSort(capacities4);

        // 🔹 Test Case 5: All Equal Values
        int[] capacities5 = {40, 40, 40};
        bubbleSort(capacities5);
    }
}