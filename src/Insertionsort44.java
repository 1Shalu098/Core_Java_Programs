import java.util.Arrays;

public class Insertionsort44 {
    public static void main(String[] args) {
        int arr [] ={4,3,6,7,11,9};
        int i=0, j=0;
        while (i< arr.length){
            if (arr[i]>0){
                int temp = arr[i];
                arr [i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
