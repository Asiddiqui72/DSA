import java.util.*;
public class MajorityElemet {
    public static void majorityCheck(int[] num) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = num.length;

        // Count occurrences of each element
        for (int i = 0; i < n; i++) {
            if (map.containsKey(num[i])) {
                map.put(num[i], map.get(num[i]) + 1);
            } else {
                map.put(num[i], 1);
            }
        }

        // Check for majority elements (those appearing more than n/3 times)
        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        // Creating an array of integers
        int[] arr = {1, 3, 2, 5, 1, 3, 1, 5, 1};

        // Calling the majorityCheck function and passing the array
        majorityCheck(arr);
    }
}
