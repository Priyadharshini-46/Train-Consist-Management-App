import java.util.*;

class GoodsBogie {
    private String type;   // e.g., Cylindrical, Open, Box
    private String cargo;  // e.g., Petroleum, Coal, Grain

    // Constructor
    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    // Getters
    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    // Display method
    public void display() {
        System.out.println(type + " Bogie carrying " + cargo);
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        // Step 1: Create Goods Bogie List
        List<GoodsBogie> goodsList = new ArrayList<>();
        goodsList.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsList.add(new GoodsBogie("Open", "Coal"));
        goodsList.add(new GoodsBogie("Box", "Grain"));

        // Step 2: Apply Safety Validation using Stream
        boolean isSafe = goodsList.stream()
                .allMatch(b ->
                        !b.getType().equalsIgnoreCase("Cylindrical")
                                || b.getCargo().equalsIgnoreCase("Petroleum")
                );

        // Step 3: Display Result
        if (isSafe) {
            System.out.println("Train is SAFE for operation.");
        } else {
            System.out.println("Train is NOT SAFE! Invalid cargo detected.");
        }

        // Step 4: Display Bogies
        System.out.println("\nGoods Bogie Details:");
        for (GoodsBogie b : goodsList) {
            b.display();
        }
    }
}