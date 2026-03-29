import java.util.Arrays;

public class BubboleAarray {
    // bubbole sort algorithm
    public static void bubloarray(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
   public static void main(String[] args) {
    int arr[] = {1,3,4,2,5};
    bubloarray(arr);
   }
}
