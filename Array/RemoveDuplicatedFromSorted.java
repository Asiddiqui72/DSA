public class RemoveDuplicatedFromSorted {

    public static int Remove(int [] nums){
        if (nums.length == 0) return 0;

        int j = 1; // j keeps track of the position to insert the next unique element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2};
        int length = Remove(arr);
        System.out.println(length);
        System.out.print("Array after removal of duplicates: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
