import java.util.HashSet;

public class  unionOfTwoArr {
    public static  int Union(int [] arr1, int [] arr2){
        HashSet<Integer>  set = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }
        return set.size();
    }



    public static void main(String[] args) {
            int arr[] = {1, 2, 3};
            int arr1[] = {5, 3, 5 ,1, 5, 6};
            int n = Union(arr, arr1);
        System.out.println(n);
    }
}
