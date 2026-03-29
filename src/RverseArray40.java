import java.util.Arrays;

public class RverseArray40 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        //int revere[] = new  int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j <arr.length ; j++) {
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i] = temp;

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
