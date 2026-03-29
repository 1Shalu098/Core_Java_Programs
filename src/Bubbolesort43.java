import java.util.Arrays;

public class Bubbolesort43 {
    public static void main(String[] args) {
        int arr[] = {4,3,6,7,11,9};
        for (int i=0; i<arr.length-1; i++){
            int minIndex = i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j]<arr[minIndex]){
                    minIndex = j;
                }

            }
            if (minIndex !=i){
                int temp =arr[i];
                arr[i] =arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
