public class TrainConsistManagementApp {

    // 🔹 Custom Exception Class
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // 🔹 Passenger Bogie Class
    static class PassengerBogie {
        private String type;
        private int capacity;

        // Constructor with validation
        public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.type = type;
            this.capacity = capacity;
        }

        public String getType() {
            return type;
        }

        public int getCapacity() {
            return capacity;
        }

        @Override
        public String toString() {
            return "PassengerBogie{type='" + type + "', capacity=" + capacity + "}";
        }
    }

    // 🔹 Main Method (Testing Flow)
    public static void main(String[] args) {

        try {
            // ✅ Valid Bogie Creation
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie b2 = new PassengerBogie("AC Chair", 60);

            System.out.println("Created Successfully:");
            System.out.println(b1);
            System.out.println(b2);

            // ❌ Invalid Bogie (Negative Capacity)
            PassengerBogie b3 = new PassengerBogie("First Class", -10);

        } catch (InvalidCapacityException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        try {
            // ❌ Invalid Bogie (Zero Capacity)
            PassengerBogie b4 = new PassengerBogie("Sleeper", 0);

        } catch (InvalidCapacityException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        try {
            // ✅ Multiple Valid Bogies
            PassengerBogie b5 = new PassengerBogie("First Class", 40);
            PassengerBogie b6 = new PassengerBogie("AC Chair", 80);

            System.out.println("More Valid Bogies:");
            System.out.println(b5);
            System.out.println(b6);

        } catch (InvalidCapacityException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}