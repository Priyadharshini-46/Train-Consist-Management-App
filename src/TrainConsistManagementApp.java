public class TrainConsistManagementApp {

    // 🔹 Linear Search Method
    public static boolean linearSearch(String[] bogieIds, String key) {

        for (int i = 0; i < bogieIds.length; i++) {

            // 🔹 Compare using equals()
            if (bogieIds[i].equals(key)) {
                return true; // Match found
            }
        }

        return false; // Not found
    }

    // 🔹 Main Method
    public static void main(String[] args) {

        // 🔹 Test Dataset
        String[] bogies = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // 🔹 Test Case 1: Found in Middle
        String search1 = "BG309";
        System.out.println("Searching " + search1 + ": " + linearSearch(bogies, search1));

        // 🔹 Test Case 2: Not Found
        String search2 = "BG999";
        System.out.println("Searching " + search2 + ": " + linearSearch(bogies, search2));

        // 🔹 Test Case 3: First Element
        String search3 = "BG101";
        System.out.println("Searching " + search3 + ": " + linearSearch(bogies, search3));

        // 🔹 Test Case 4: Last Element
        String search4 = "BG550";
        System.out.println("Searching " + search4 + ": " + linearSearch(bogies, search4));

        // 🔹 Test Case 5: Single Element Array
        String[] singleBogie = {"BG101"};
        String search5 = "BG101";
        System.out.println("Searching " + search5 + " in single array: "
                + linearSearch(singleBogie, search5));
    }
}