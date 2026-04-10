import java.util.*;

class TrainConsistApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<String> bogieIds = new ArrayList<>();

        String searchKey = "BG101";

        if (bogieIds.isEmpty()) {
            throw new IllegalStateException("Cannot perform search: No bogies in the train");
        }

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break;
            }
        }

        System.out.println("Bogie Found: " + found);
    }
}