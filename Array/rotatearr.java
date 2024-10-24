import java.util.Arrays;

public class rotatearr {


    public static int [] rotate(int [] arr, int k){
        int n = arr.length;
        revers(arr, 0, n-1);
        revers(arr, 0, k-1);
        revers(arr, k, n- 1);
        return arr;
    }

    public  static void revers( int arr [] , int start , int end){
        while (start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        int arr [] = {1, 2, 3, 4, 5, 6, 7};
        int k=3;
        System.out.println(Arrays.toString(rotate(arr, k)));
    }
}
