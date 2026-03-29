import java.util.Arrays;

public class SeparatArray47 {
    public static void main(String[] args) {
        int arr[] = {-1, 2, -4, 10, -3, 5, 10, -7};
        int i = 0, j=0;
        while (i<arr.length){
            if (arr[i]>0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
