import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            int rem = target - nums[i];
            if (map.containsKey(rem)) {
                // Print the indices of the two numbers
                System.out.println("Indices: " + map.get(rem) + ", " + i);
                return; // Exit the program after finding the first solution
            }
            map.put(nums[i], i);
        }

    }
}
