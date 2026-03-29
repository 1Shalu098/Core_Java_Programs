import java.util.Arrays;

public class Selectionsort {
    // selection sort 
    public static void seclectionsoort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minpos = i;
            for(int j=i+1; j<arr.length; j++){
                if (arr[minpos] > arr[j]) {
                    minpos =j;
                    
                }
            }
            int temp = arr[minpos];
            arr[minpos] =arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,5,3};
        seclectionsoort(arr);
    }
}
