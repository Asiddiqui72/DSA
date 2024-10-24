public class MergeSortedArray {

    public static void sort(int [] num1,int [] num2 , int m, int n ){

        int i = m-1;
        int k = m + n -1;
        int j = n - 1;
        while (j >= 0){
            if(i>= 0 && num1[i] > num2[j]){
                num1[k] = num1[i];
                i--;
            }else{
                num1[k] = num2[j];
                j--;
            }
            k--;
        }

    }

    public static void main(String[] args) {
       int nums1[]= {1,2,3,0,0,0};
        int m = 3;
       int [] nums2 = {2,5,6};
        int n = 3;
        sort(nums1, nums2, m, n);
        for (int i=0; i<nums1.length; i++){
            System.out.println(nums1[i]);
        }

    }

}
