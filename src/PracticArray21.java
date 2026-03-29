import java.util.Arrays;

public class PracticArray21 {
    public static void main(String[] args) {
        int arr[] = {0,1,1,0,1,0,1,1,0};
        int i =0 , j=0;
        while (i < arr.length){
            if (arr[i] >0){
                int tem = arr[i];
                arr[i]= arr[j];
                arr[j] = tem;
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
