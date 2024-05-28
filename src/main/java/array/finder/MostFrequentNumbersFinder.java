package array.finder;

import java.util.*;

/**
 * Main class that finds the most frequently occurring number(s) in an array.
 */
public class Main {

    /**
     * The main method that executes the program.
     *
     * @param args The arguments passed to the main method
     */
    public static void main(String[] args) {

        // Initialize the array
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5};
        System.out.println("Input data: " + Arrays.toString(array));

        // Call the method to find the most frequently occurring number(s)
        List<Integer> maxCountNumbers = findMostFrequentNumbers(array);

        // Print the most frequently occurring number(s)
        System.out.println("Most frequent number(s): " + maxCountNumbers);
    }

    /**
     * This method finds and returns the most frequently occurring number(s) in an array.
     *
     * @param array The input array
     * @return A list of the most frequently occurring number(s)
     */
    public static List<Integer> findMostFrequentNumbers(int[] array) {

        // Create a map to store the count of each number
        Map<Integer, Integer> countMap = new HashMap<>();

        // Loop through the array and update the count for each number
        for (int i : array) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }

        // Find the maximum count
        int maxCount = Collections.max(countMap.values());

        // Create a list to store numbers with the maximum count
        List<Integer> maxCountNumbers = new ArrayList<>();

        // Loop through the map and add numbers with the maximum count to the list
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                maxCountNumbers.add(entry.getKey());
            }
        }

        // Return the list of most frequently occurring number(s)
        return maxCountNumbers;
    }
}
