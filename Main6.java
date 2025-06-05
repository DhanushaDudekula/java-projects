package dhanu;
import java.util.TreeMap;

public class Main6{
    public static void main(String[] args) {
        // Create TreeMap to store country-capital pairs
        TreeMap<String, String> countryMap = new TreeMap<>();

        // Add entries
        countryMap.put("India", "New Delhi");
        countryMap.put("USA", "Washington");
        countryMap.put("Germany", "Berlin");
        countryMap.put("Japan", "Tokyo");
        countryMap.put("India", "New Delhi"); // Duplicate key with same value

        // Display all entries in sorted order by country name
        System.out.println("Country - Capital List (Sorted):");
        for (String country : countryMap.keySet()) {
            System.out.println(country + " -> " + countryMap.get(country));
        }

        // TreeMap methods
        System.out.println("\nFirst Country: " + countryMap.firstKey());
        System.out.println("Last Country: " + countryMap.lastKey());
        System.out.println("Country higher than 'Germany': " + countryMap.higherKey("Germany"));
        System.out.println("Country lower than 'Japan': " + countryMap.lowerKey("Japan"));
    }
}
