import java.util.Arrays;

public class Inserctionsort {
    // insertion sort algorithm
    public static void inserction (int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int  prev = i-1;
            while (prev>=0 && arr[prev]> curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
            
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr [] = {2,1,5,3,4};
        inserction(arr);
    }
    
}
