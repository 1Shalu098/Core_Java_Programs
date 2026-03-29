import java.util.Arrays;

public class Practic22 {
    public static void main(String[] args) {
        int arr[] = {1,2,-3,4,-7,4,-4,5,-6,};
        int i = 0, j=0;
        while (i < arr.length){
            if (arr[i] > 0){
                int tem = arr[i];
                arr[i] = arr[j];
                arr[j] = tem;
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
