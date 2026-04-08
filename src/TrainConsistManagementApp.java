public class TrainConsistManagementApp {

    // 🔹 Search Method with Validation (Linear Search + Exception Handling)
    public static boolean searchBogie(String[] bogieIds, String key) {

        // 🔹 Fail-Fast Validation
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in the train to search.");
        }

        // 🔹 Perform Linear Search
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true; // ✅ Found
            }
        }

        return false; // ❌ Not Found
    }

    // 🔹 Main Method (Testing Flow)
    public static void main(String[] args) {

        // 🔹 Test Case 1: Empty Array (Should Throw Exception)
        try {
            String[] empty = {};
            System.out.println("Searching in empty array...");
            searchBogie(empty, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        // 🔹 Test Case 2: Valid Search (Data Exists)
        String[] bogies = {"BG101", "BG205", "BG309"};

        System.out.println("Search BG205: " + searchBogie(bogies, "BG205")); // true
        System.out.println("Search BG999: " + searchBogie(bogies, "BG999")); // false

        // 🔹 Test Case 3: Single Element
        String[] single = {"BG101"};
        System.out.println("Search BG101 (single): " + searchBogie(single, "BG101")); // true
    }
}