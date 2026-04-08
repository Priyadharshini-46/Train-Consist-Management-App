import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {

    // 🔹 Bogie Class
    static class Bogie {
        private String id;
        private int capacity;

        public Bogie(String id, int capacity) {
            this.id = id;
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

        public String getId() {
            return id;
        }

        @Override
        public String toString() {
            return "Bogie{id='" + id + "', capacity=" + capacity + "}";
        }
    }

    // 🔹 Loop-Based Filtering
    public static List<Bogie> filterUsingLoop(List<Bogie> bogies) {
        List<Bogie> result = new ArrayList<>();

        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                result.add(b);
            }
        }
        return result;
    }

    // 🔹 Stream-Based Filtering
    public static List<Bogie> filterUsingStream(List<Bogie> bogies) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
    }

    // 🔹 Main Method (Performance Benchmark)
    public static void main(String[] args) {

        // 🔹 Create Large Dataset
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 1; i <= 100000; i++) {
            bogies.add(new Bogie("B" + i, (int)(Math.random() * 100)));
        }

        // 🔹 Loop Benchmark
        long startLoop = System.nanoTime();
        List<Bogie> loopResult = filterUsingLoop(bogies);
        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // 🔹 Stream Benchmark
        long startStream = System.nanoTime();
        List<Bogie> streamResult = filterUsingStream(bogies);
        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // 🔹 Output Results
        System.out.println("Loop Result Count: " + loopResult.size());
        System.out.println("Stream Result Count: " + streamResult.size());

        System.out.println("Loop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime);

        // 🔹 Validate Results
        if (loopResult.size() == streamResult.size()) {
            System.out.println("✅ Results Match!");
        } else {
            System.out.println("❌ Results Do Not Match!");
        }
    }
}