import java.util.Arrays;

public class ArryRewers40 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int i = arr.length - 1;
        int temp[] = new int[arr.length];
        for (int j = 0; j < temp.length; j++) {
            temp[j] = arr[i];
            i--;
        }
        System.out.println(Arrays.toString(temp));
    }
}