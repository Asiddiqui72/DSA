import java.util.Arrays;

public class selectionsort {
    static  void selection(int []arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;  // Assume the first unsorted element is the minimum
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;  // Update minIndex if a smaller element is found
                }
            }
            // Swap the found minimum element with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

    }
    public static void main(String[] args) {
        int [] arr = {4, 5, 1, 3, 2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
