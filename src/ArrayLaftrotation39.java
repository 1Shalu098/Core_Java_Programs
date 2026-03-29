import java.util.Arrays;

public class ArrayLaftrotation39 {
    public static void main(String[] args) {
        // arry left rotation
       // int arr [] = {1, 2, 3, 4, 5};
        int arr[] = {5, 2, 8, 4};
        int copy = arr[0];
        for (int i = 0; i <arr.length-1; i++){
            arr[i] = arr[i+1];

        }
        arr[arr.length-1] = copy;
        System.out.println(Arrays.toString(arr));
    }
}
