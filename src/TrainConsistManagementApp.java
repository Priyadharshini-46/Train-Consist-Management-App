public class TrainConsistManagementApp {

    // 🔹 Custom Runtime Exception
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // 🔹 Goods Bogie Class
    static class GoodsBogie {
        private String shape;   // Rectangular or Cylindrical
        private String cargo;

        public GoodsBogie(String shape) {
            this.shape = shape;
        }

        // 🔹 Cargo Assignment with try-catch-finally
        public void assignCargo(String cargoType) {
            try {
                // ❌ Unsafe condition
                if (shape.equalsIgnoreCase("Rectangular") &&
                        cargoType.equalsIgnoreCase("Petroleum")) {
                    throw new CargoSafetyException(
                            "Unsafe: Cannot assign Petroleum to Rectangular bogie"
                    );
                }

                // ✅ Safe assignment
                this.cargo = cargoType;
                System.out.println("Cargo assigned successfully: " + cargoType);

            } catch (CargoSafetyException e) {
                // 🔹 Handle exception gracefully
                System.out.println("Exception Caught: " + e.getMessage());

            } finally {
                // 🔹 Always executes
                System.out.println("Cargo assignment attempt completed for " + shape + " bogie.\n");
            }
        }

        public String getCargo() {
            return cargo;
        }

        public String getShape() {
            return shape;
        }

        @Override
        public String toString() {
            return "GoodsBogie{shape='" + shape + "', cargo='" + cargo + "'}";
        }
    }

    // 🔹 Main Method (Simulation)
    public static void main(String[] args) {

        // ✅ Safe Case
        GoodsBogie g1 = new GoodsBogie("Cylindrical");
        g1.assignCargo("Petroleum");

        // ❌ Unsafe Case
        GoodsBogie g2 = new GoodsBogie("Rectangular");
        g2.assignCargo("Petroleum");

        // ✅ Another Safe Case (Program continues)
        GoodsBogie g3 = new GoodsBogie("Rectangular");
        g3.assignCargo("Coal");

        // 🔹 Verify Results
        System.out.println("Final Bogie States:");
        System.out.println(g1);
        System.out.println(g2); // Should not have petroleum
        System.out.println(g3);
    }
}