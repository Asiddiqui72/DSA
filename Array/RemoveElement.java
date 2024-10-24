public class RemoveElement {
    public static  int elecment(int [] nums,int val){
        int count =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {3, 2, 2, 3};
        int k=3;
        int ans = elecment(arr, k);
        System.out.println(ans);

    }
}
