public class plusMinus {
    public static void main(String[] args) {
        int arr [] = {-1, -1, 1, 1, 0};
        int positive = 0;
        int zero = 0;
        int negative = 0;
        int leng = arr.length;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                negative++;
            }
            else if(arr[i] > 0){
                positive++;
            }
            else{
                zero++;
            }
        }
        System.out.printf("%.6f\n", (double) positive / leng);
        System.out.printf("%.6f\n", (double) negative / leng);
        System.out.printf("%.6f\n", (double) zero / leng);
    }
}
